package tdh.platform.export.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import tdh.thunder.common.AppContext;

public class I18n {

	private static MessageSource ms;

	private static final Logger LOG = LoggerFactory.getLogger(I18n.class);

	public static String wrapperKey(String key) {
		return "{" + key + "}";
	}

	private static void ensureMessageSource() {
		if (null == ms) {

			synchronized (I18n.class) {

				if (null == ms) {
					try {
						ms = (MessageSource) AppContext.getBean("messageSource");
					} catch (Exception e) {
						LOG.error("Error creating MessageSource", e);
					}
				}

			}
		}
	}

	private static String doGetMsg(String key, String defaultMessage, Object... args) {

		ensureMessageSource();

		if (null == ms) {
			return key;
		}

		return ms.getMessage(key, args, defaultMessage, null);
	}

	public static String getMsg(String key) {
		return doGetMsg(key, null);
	}

	public static String getMsg(String key, Object... args) {
		return doGetMsg(key, null, args);
	}

	public static String getMsgSafely(String key, String defaultMessage) {
		return doGetMsg(key, defaultMessage, null);
	}

	public static String getMsgSafely(String key, String defaultMessage, Object... args) {
		return doGetMsg(key, defaultMessage, args);
	}

}
