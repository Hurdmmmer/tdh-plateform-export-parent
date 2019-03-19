package tdh.platform.export.service.listener;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import tdh.platform.export.entity.ExportContext;
import tdh.platform.export.service.service.IExportService;
import tdh.thunderframework.aa.authc.LocalTrustedToken;
import tdh.thunderframework.aa.context.PlatformSubject;
import tdh.thunderframework.aa.context.SecurityHelper;

/**
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2014  
 * Company:		上海天地汇
 * Author:		fy
 * Version:		1.0  
 * Created at:	2017-3-16 上午10:44:01
 * </pre>
 */
public class ExportTaskListener implements MessageListener {

	private static final Logger LOGGER = Logger.getLogger(ExportTaskListener.class);

	private static final ObjectMapper MAPPER = new ObjectMapper();

	@Autowired
	private IExportService exportService;


	private void shiroSubjectLogin(PlatformSubject subject) {
		Subject shiroSubject = SecurityHelper.getShiroSubject();
		LocalTrustedToken token = new LocalTrustedToken();
		token.setSubject(subject);
		shiroSubject.login(token);
	}

	private void ensureUserIsLoginOut() {
		// Get the user if one is logged in.
		Subject currentUser = SecurityHelper.getShiroSubject();
		if (currentUser == null)
			return;
		// Log the user out and kill their session if possible.
		currentUser.logout();
		Session session = currentUser.getSession(false);
		if (session == null)
			return;
		session.stop();
	}

    @Override
    public void onMessage(Message message) {
        ExportContext exportContext = null;
        try {
            /**
             * 获取传入对象
             */
            byte[] body = message.getBody();

            JsonNode jsonNode = MAPPER.readTree(new String(body));

            JSONObject jsonObject = JSONObject.fromObject(jsonNode.toString());

            exportContext = (ExportContext) JSONObject.toBean(jsonObject, ExportContext.class);

            exportService.executeExport(exportContext);


        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            /**
             * 出现异常更新导出任务状态
             */
            if (null != exportContext) {
                exportService.updateTaskStatus(exportContext.getTaskId(), e.getMessage() == null ? "下载服务异常， 未知错误. 请查看错误日志" : e.getMessage());
            }
        }
    }
}
