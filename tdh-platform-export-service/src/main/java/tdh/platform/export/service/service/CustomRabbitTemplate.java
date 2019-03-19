package tdh.platform.export.service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import tdh.platform.export.config.datasource.DataSourceHolder;
import tdh.platform.export.dao.IMqHistoryMapper;
import tdh.platform.export.entity.MqHistory;
import tdh.platform.export.utils.SpringUtil;
import tdh.thunderframework.aa.context.PlatformSubject;
import tdh.thunderframework.aa.context.SecurityHelper;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomRabbitTemplate extends RabbitTemplate {
	private static final Logger LOG = LoggerFactory.getLogger(CustomRabbitTemplate.class);

	private volatile String exchange = "";

	private volatile String routingKey = "";

	@Autowired
	private IMqHistoryMapper IMqHistoryMapper;

	private ExecutorService pool = Executors.newFixedThreadPool(1);

	public CustomRabbitTemplate(ConnectionFactory connectionFactory) {
		super();
		super.setConnectionFactory(connectionFactory);
	}

	@Override
	public void convertAndSend(final Object object) throws AmqpException {

		try {
			pool.execute(new Runnable() {
				@Override
				public void run() {
					createMqHistory(getExchange(), getRoutingKey(), object);
				}
			});
		} catch (Exception e) {
			LOG.warn(e.getMessage(), e);
			LOG.warn("convertAndSend,exchange={},routingKey={}", this.exchange, this.routingKey + ",message=" + object);
		}

		super.convertAndSend(this.exchange, this.routingKey, object, (CorrelationData) null);
	}

	public void setExchange(String exchange) {
		this.exchange = (exchange != null) ? exchange : "";
		super.setExchange(this.exchange);
	}

	public String getExchange() {
		return this.exchange;
	}

	public void setRoutingKey(String routingKey) {
		this.routingKey = routingKey;
		super.setRoutingKey(this.routingKey);
	}

	public String getRoutingKey() {
		return this.routingKey;
	}

	private void createMqHistory(String exchange, String routingKey, Object object) {
		PlatformSubject subject = null;
		try {
			subject = SecurityHelper.getSubject();// 当前操作用户
		} catch (Exception e) {
			LOG.warn("没有用户登录信息：" + e.getMessage());
		}
		MqHistory hist = new MqHistory();
		hist.setCreatedBy(null == subject ? 0 : subject.getSubjectId());

		hist.setCreatedByName(null == subject ? "0" : subject.getSubjectName());

		hist.setCreatedTime(new Date());
		hist.setExchange(exchange);
		hist.setMessage(object);
		hist.setRoutingkey(routingKey);
		// 设置当前线程为 任务数据源,如果存在多数据源
		if (SpringUtil.getApplicationContext().containsBean("routingDataSource")) {
			DataSourceHolder.taskDb();
		}
		IMqHistoryMapper.insertSelective(hist);
	}

}