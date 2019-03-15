package com.dodo.project.base.exception.bean;

/*
 * <b>RestResponseResult</b></br>
 *
 * <pre>
 * restful风格响应bean
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/10/5 14:49
 * @Since JDK 1.8
 */
public class RestResponseResult {
	private int    status;
	private String message;
	private Object data;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
