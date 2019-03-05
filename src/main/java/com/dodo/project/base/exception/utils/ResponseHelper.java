package com.dodo.project.base.exception.utils;

import com.dodo.project.base.exception.core.BussinessException;
import com.dodo.project.base.exception.enums.ResponseStatusEnum;

/**
 * <b>ResponseHelper</b></br>
 *
 * <pre>
 *  响应帮助类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/10/5 18:32
 * @Since JDK 1.8
 */
public class ResponseHelper {
	/*
	 * @Description: 业务异常处理
	 * @Author: walk_code walk_code@163.com
	 * @Param: [message]
	 * @return: void
	 * @Date: 2018/10/5 18:34
	 */
	public static void failure(String message) {
		throw new BussinessException(ResponseStatusEnum.STATUS_500.getStatus(), message);
	}
	
	/*
	* @Description: 响应结果 
	* @Author: walk_code walk_code@163.com
	* @Param: [status, message] 
	* @return: void  
	* @Date: 2018/10/12 16:43
	*/ 
	public static void response(String status, String message) {
		response(status, message, null);
	}
	
	/*
	* @Description: 响应结果
	* @Author: walk_code walk_code@163.com
	* @Param: [status, message, data] 
	* @return: void  
	* @Date: 2018/10/12 16:43
	*/ 
	public static void response(String status, String message, Object data) {
		throw new BussinessException(status, message, data);
	}
	
	/*
	* @Description: 响应结果
	* @Author: walk_code walk_code@163.com
	* @Param: [object] 
	* @return: void  
	* @Date: 2018/10/12 16:45
	*/ 
	public static void success(Object object) {
		throw  new BussinessException(object);
	}
}
