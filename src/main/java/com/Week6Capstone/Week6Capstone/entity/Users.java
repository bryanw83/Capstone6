package com.Week6Capstone.Week6Capstone.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	
	private Integer userid;
	private String username;
	private String userpassword;
	
	public Users() {
		
	}

	public Users(String username, String userpassword) {
		super();
		this.username = username;
		this.userpassword = userpassword;
	}

	public Users(Integer userid, String username, String userpassword) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	

}
