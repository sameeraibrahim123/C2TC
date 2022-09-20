package com.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Placement")

public class Placement implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int placeId;
	private String pname;
	private String qualification;
	private int year;
	private LocalDate date;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="College_ID")
	private College college;
	
	public Placement() {
		
	}
	
	public Placement(int placeId, String pname, String qualification, int year, LocalDate date,College college) {
		this.placeId = placeId;
		this.pname = pname;
		this.qualification = qualification;
		this.year = year;
		this.date = date;
		this.college=college;
	}
	public int getPlaceId() 
	{
		return placeId;
	}
	public void setPlaceId(int placeId) 
	{
		this.placeId = placeId;
	}
	public String getPname() 
	{
		return pname;
	}
	public void setPname(String pname) 
	{
		this.pname = pname;
	}
	public String getQualification() 
	{
		return qualification;
	}
	public void setQualification(String qualification) 
	{
		this.qualification = qualification;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public LocalDate getDate()
	{
		return date;
	}
	public void setDate(LocalDate date) 
	{
		this.date = date;
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
	public String toString()
	{
		return "Placement [placeId=" + placeId + ", pname=" + pname + ", qualification=" + qualification + ", year="
				+ year + ", date=" + date + ", college=" + college + "]";
	}
	

}
