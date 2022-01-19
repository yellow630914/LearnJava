package com.lijen.object_oriented_0118;


/*
 * 
 * 甚麼是JavaBean? 是指符合如下標準的Java類:
 * 	-class是公共的
 * 	-有一個無參的公共構造器
 * 	-有屬性,且有對應的get、set方法
 * 
 */

public class WhatIsJavaBean {
	int id;
	String name;
	
	public WhatIsJavaBean() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

