package com.dodo.project.base.exception.enums;

/** 
* @Description: 系统响应状态码enum类
* @Author: walk_code walk_code@163.com
* @Param:  
* @return:   
* @Date: 2018/10/5 16:53
*/ 
public enum ResponseStatusEnum {
	STATUS_200("200", "操作成功。"),
	STATUS_500("500", "操作失败。"),
	STATUS_401("401", "未授权");

	private String status;
	private String description;

	private ResponseStatusEnum(String status, String description) {
		this.status = status;
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}

	public String getDescription() {
		return this.description;
	}
}
