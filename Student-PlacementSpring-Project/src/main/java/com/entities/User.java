package com.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User")

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String type;
	
	@Id
	private int userId;
	private String name;
	private String password;
	
	
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="Clg_Id")
	private College college;
	
	public User() {
		
	}
	
	public User(String type, int userId, String name, String password, College college) {
		this.type = type;
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.college = college;
	}

	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public int getUserId() 
	{
		return userId;
	}
	public void setUserId(int userId) 
	{
		this.userId = userId;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public College getCollege()
	{
		return college;
	}
	public void setCollege(College college)
	{
		this.college=college;
	}
	
	
	@Override
	public String toString() {
		return "User [type=" + type + ", userId=" + userId + ", name=" + name + ", password=" + password
				+ ", college=" + college + "]";
	}


}
