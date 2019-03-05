package com.dodo.project.base.exception.core;

/*
 * <b>ApplicationException</b></br>
 *
 * <pre>
 * 应用异常类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/10/5 16:08
 * @Since JDK 1.8
 */
public class ApplicationException extends RuntimeException {
	protected String status;
	protected String message;

	public ApplicationException() {

	}

	public ApplicationException(String message) {
		super(message);
		this.message = message;
	}

	public ApplicationException(String message, String status) {
		super(status + ":" + message);
		this.status = status;
		this.message = message;
	}

	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
		this.message = message;
	}

	public ApplicationException(Throwable cause) {
		super(cause);
	}

	@Override
	public synchronized Throwable fillInStackTrace() {
		return null; // 当前异常类不需要进行堆栈记录（stack trace）
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String getMessage() {
		return message;
	}


}
