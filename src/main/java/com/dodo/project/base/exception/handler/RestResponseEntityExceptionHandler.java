package com.dodo.project.base.exception.handler;

import com.dodo.project.base.exception.bean.RestResponseResult;
import com.dodo.project.base.exception.core.ApplicationException;
import com.dodo.project.base.exception.core.BussinessException;
import com.dodo.project.base.exception.utils.JsonHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/*
 * <b>RestResponseEntityExceptionHandler</b></br>
 *
 * <pre>
 * 业务异常处理
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/11/15 14:05
 * @Since JDK 1.8
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	private static final Logger log = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);

	@Autowired
	private Environment env;
	/*
	* @Description: 统一处理所有的异常信息
	* @Author: walk_code walk_code@163.com
	* @Param: [ex, request]
	* @return: org.springframework.http.ResponseEntity
	* @Date: 2019/1/30 19:01
	*/
	@ExceptionHandler
	protected ResponseEntity handelConflict(RuntimeException ex, WebRequest request) {
		String message = ex.toString();
		int    status  = HttpStatus.INTERNAL_SERVER_ERROR.value();
		Object data    = null;
		String debug   = env.getProperty("dodo.debug");

		if (ex instanceof BussinessException) {
			BussinessException bussinessException = (BussinessException) ex;
			data = bussinessException.getData();
			message = bussinessException.getMessage() == null ? "操作成功." : bussinessException.getMessage();
			String statusStr = bussinessException.getStatus() == null ? "200" : bussinessException.getStatus();
			status = Integer.valueOf(statusStr);
		}else{
			if (StringUtils.isEmpty(debug) || !debug.equals("true")){
				message = "系统发生内部错误，请联系系统管理员。";
			}
		}

		RestResponseResult restResponseResult = new RestResponseResult();
		restResponseResult.setStatus(status);
		restResponseResult.setMessage(message);
		restResponseResult.setData(data);

		return new ResponseEntity<>(restResponseResult, HttpStatus.OK);
	}

}
