package com.atguigu.springcloud.entities;

import java.io.Serializable;


public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	dNo; // 主键
	private String 	dName; // 部门名称
	private String 	dbSource;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Dept(Long dNo)
	{
		this.dNo = dNo;
	}

	public Long getdNo() {
		return dNo;
	}

	public void setdNo(Long dNo) {
		this.dNo = dNo;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getDbSource() {
		return dbSource;
	}

	public void setDbSource(String dbSource) {
		this.dbSource = dbSource;
	}
}
