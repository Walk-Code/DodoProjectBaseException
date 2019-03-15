package com.dodo.project.base.exception.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/*
 * <b>CustomResponseResult</b></br>
 *
 * <pre>
 * 自定义响应结果
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/10/5 14:38
 * @Since JDK 1.8
 */
public class CustomResponseResult implements Serializable {
	private Map<String, Object> customMap;

	/*
	 * @Description: 自定义响应结果
	 * @Author: walk_code walk_code@163.com
	 * @Param: [column, value]
	 * @return: com.dodo.project.base.exception.bean.CustomResponseResult
	 * @Date: 2018/10/5 14:41
	 */
	public CustomResponseResult set(String column, Object value) {
		this.getColums().put(column, value);

		return this;
	}

	public Map<String, Object> getColums() {
		if (null == customMap) {
			customMap = new HashMap<String, Object>(5);
		}

		return this.customMap;
	}
}
