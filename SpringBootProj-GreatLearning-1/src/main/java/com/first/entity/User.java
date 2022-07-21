package com.first.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "usrId" )
	private Integer userId;
	
	@Column(name = "usrName" )
	private String  userName;
	
	@Column(name = "usrAddr" )
	private String  userAddr;
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddr=" + userAddr + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	
	
}
