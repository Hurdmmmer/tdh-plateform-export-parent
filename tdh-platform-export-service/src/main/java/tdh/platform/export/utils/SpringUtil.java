package tdh.platform.export.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
//@Conditional(ExcludeSpringUtils.class)
public class SpringUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext; // Spring应用上下文环境

	/*
	 * 
	 * 实现了ApplicationContextAware 接口，必须实现该方法；
	 * 
	 * 通过传递applicationContext参数初始化成员变量applicationContext
	 */

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringUtil.applicationContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static <T> T getBean(Class<T> clazz) throws BeansException {
		return (T) applicationContext.getBean(clazz);
	}

}
