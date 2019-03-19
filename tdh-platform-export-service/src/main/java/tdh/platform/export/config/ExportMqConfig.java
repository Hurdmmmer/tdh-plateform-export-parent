package tdh.platform.export.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import tdh.platform.export.service.listener.ExportTaskListener;
import tdh.platform.export.service.service.CustomRabbitTemplate;
import tdh.thunder.common.utils.ConfigProperties;

@Configuration
public class ExportMqConfig {

    public static ConfigProperties config;
    private String routerKey = StringUtils.join(getExportConfig().getPropertyAsString("export.task.queue.key"),
            ".", getExportConfig().getPropertyAsString("project.name"));

    private static ConfigProperties getExportConfig() {
        if (config == null) {
            config = ConfigProperties.getInstance("general_export");
        }
        return config;
    }

    @Bean(name = "mqConnectionFactory")
    @Order(Integer.MAX_VALUE - 100)
    @Conditional(ExportMqConditional.class)
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setHost(getExportConfig().getPropertyAsString("rabbitmq.host"));
        connectionFactory.setUsername(getExportConfig().getPropertyAsString("rabbitmq.username"));
        connectionFactory.setPassword(getExportConfig().getPropertyAsString("rabbitmq.password"));
        connectionFactory.setPort(getExportConfig().getPropertyAsInt("rabbitmq.port", 5762));
        connectionFactory.setVirtualHost("/");
        return connectionFactory;
    }

    @Bean
    @Order(Integer.MAX_VALUE - 99)
    @Conditional(ExportMqConditional.class)
    public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
        if (connectionFactory == null) {
            return new RabbitAdmin(connectionFactory());
        }
        return new RabbitAdmin(connectionFactory);
    }

    @Bean(name = "exportExchange")
    @Order(Integer.MAX_VALUE - 98)
    public TopicExchange topicExchange() {
        return new TopicExchange(getExportConfig().getPropertyAsString("export.task.exchange"));
    }

    @Bean(name = "exportQueue")
    @Order(Integer.MAX_VALUE - 98)
    public Queue queue() {
        return new Queue(getExportConfig().getPropertyAsString("export.task.queue"), true, false, false);
    }

    @Bean
    @Order(Integer.MAX_VALUE - 97)
    public Binding topicBinding(@Qualifier("exportExchange") TopicExchange directExchange, @Qualifier("exportQueue") Queue queue) {
        return BindingBuilder.bind(queue).to(directExchange).with(routerKey);
    }


    @Bean(name = "exportMqTemplate")
    @Order(Integer.MAX_VALUE - 96)
    public CustomRabbitTemplate customRabbitTemplate(ConnectionFactory connectionFactory) {
        CustomRabbitTemplate customRabbitTemplate = null;
        if (connectionFactory != null) {
            customRabbitTemplate = new CustomRabbitTemplate(connectionFactory);
        } else {
            customRabbitTemplate = new CustomRabbitTemplate(connectionFactory());
        }

        customRabbitTemplate.setExchange(getExportConfig().getPropertyAsString("export.task.exchange"));
        customRabbitTemplate.setRoutingKey(routerKey);
        return customRabbitTemplate;
    }

    @Bean
    public ExportTaskListener exportTaskListener() {
        return new ExportTaskListener();
    }

    @Bean
    @Order
    public SimpleMessageListenerContainer listenerContainer(ConnectionFactory connectionFactory) {
        SimpleMessageListenerContainer listenerContainer;
        if (connectionFactory != null) {
            listenerContainer = new SimpleMessageListenerContainer(connectionFactory);
        } else {
            listenerContainer = new SimpleMessageListenerContainer(connectionFactory());
        }
        listenerContainer.setQueueNames(getExportConfig().getPropertyAsString("export.task.queue"));
        listenerContainer.setMessageListener(exportTaskListener());


        return listenerContainer;
    }

}

