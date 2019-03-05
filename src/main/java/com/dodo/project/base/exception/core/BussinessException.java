package com.dodo.project.base.exception.core;

import com.dodo.project.base.exception.bean.CustomResponseResult;
import com.dodo.project.base.exception.bean.RestResponseResult;

/*
 * <b>BussinessException</b></br>
 *
 * <pre>
 * 业务异常类
 * </pre>
 *
 * @Author xqyjjq walk_status@163.com
 * @Date 2018/10/5 16:35
 * @Since JDK 1.8
 */
public class BussinessException extends ApplicationException {
	private Object               data                 = null;
	private RestResponseResult   restResponseResult   = null;
	private CustomResponseResult customResponseResult = null;

	public BussinessException() {

	}

	public BussinessException(Throwable throwable) {
		super(throwable);
	}

	public BussinessException(String message) {
		super(message);
	}

	public BussinessException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public BussinessException(String status, String message) {
		super(message, status);
	}

	public BussinessException(String status, String message, Object data) {
		super(message, status);
		this.data = data;
	}

	public BussinessException(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public RestResponseResult getRestResponseResult() {
		return restResponseResult;
	}

	public void setRestResponseResult(RestResponseResult restResponseResult) {
		this.restResponseResult = restResponseResult;
	}

	public CustomResponseResult getCustomResponseResult() {
		return customResponseResult;
	}

	public void setCustomResponseResult(CustomResponseResult customResponseResult) {
		this.customResponseResult = customResponseResult;
	}
}
