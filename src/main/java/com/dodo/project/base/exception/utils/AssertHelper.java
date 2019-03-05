package com.dodo.project.base.exception.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * <b>AssertHelper</b></br>
 *
 * <pre>
 * 断言帮助类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/10/5 18:19
 * @Since JDK 1.8
 */
public class AssertHelper {

	/*
	 * @Description: 断言表达式为true
	 * @Author: walk_code walk_code@163.com
	 * @Param: [expression, message]
	 * @return: void
	 * @Date: 2018/10/5 18:28
	 */
	public static void isTrue(boolean expression, String message) {
		if (!expression) {
			ResponseHelper.failure(message);
		}
	}

	/*
	 * @Description: 断言表达式为true
	 * @Author: walk_code walk_code@163.com
	 * @Param:
	 * @return:
	 * @Date: 2018/10/6 11:18
	 */
	public static void isTrue(boolean expression) {
		isTrue(expression, "[Assertion failed] - this expression must be true");
	}

	/*
	 * @Description: 断言给定的object对象为空
	 * @Author: walk_code walk_code@163.com
	 * @Param: [object, message]
	 * @return: void
	 * @Date: 2018/10/6 11:19
	 */
	public static void isNull(Object object, String message) {
		if (null != object) {
			ResponseHelper.failure(message);
		}
	}

	/*
	 * @Description: 断言给定的object对象为空
	 * @Author: walk_code walk_code@163.com
	 * @Param: [object]
	 * @return: void
	 * @Date: 2018/10/6 11:20
	 */
	public static void isNull(Object object) {
		isNull(object, "[Assertion failed] - the object argument must be null");
	}

	/*
	 * @Description: 断言给定的object对象为非空
	 * @Author: walk_code walk_code@163.com
	 * @Param: [object, message]
	 * @return: void
	 * @Date: 2018/10/6 11:21
	 */
	public static void notNull(Object object, String message) {
		if (null == object) {
			ResponseHelper.failure(message);
		}
	}

	/*
	 * @Description: 断言给定的object对象为非空
	 * @Author: walk_code walk_code@163.com
	 * @Param: [object]
	 * @return: void
	 * @Date: 2018/10/6 11:22
	 */
	public static void notNull(Object object) {
		notNull(object, "[Assertion failed] - the object argument must not be null");
	}

	/*
	 * @Description: 断言给定的字符串为非空
	 * @Author: walk_code walk_code@163.com
	 * @Param: [string, message]
	 * @return: void
	 * @Date: 2018/10/6 11:25
	 */
	public static void notEmpty(String string, String message) {
		if (null == string || string.length() == 0) {
			ResponseHelper.failure(message);
		}
	}

	/*
	 * @Description: 断言给定的字符串为非空
	 * @Author: walk_code walk_code@163.com
	 * @Param: [string]
	 * @return: void
	 * @Date: 2018/10/6 11:36
	 */
	public static void notEmpty(String string) {
		notEmpty(string, "[Assertion failed] - this argument is required; it must not be null or empty");
	}

}
