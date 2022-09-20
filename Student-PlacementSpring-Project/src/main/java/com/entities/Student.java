package com.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name="studentDetail")



public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="StudentID")
	private int id;
	
	@Column(name="StudentName")
	private String name;
	
	@Column(name="StudentMarks")
	private double marks;
	
	@Column(name="Studentqual")
	private String qualification;
	
	@Column(name="StudentCourse")
	private String course;
	
	@Column(name="Year")
	private int year;
	
	@Column(name="Hallticketno")
	private int hallticketno;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="Certy_Id")
	private Certificate certificate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="College_ID")
	private College college;
	
	public Student() {
		
	}
	public Student(int id, String name, double marks, String qualification, String course, int year,
			int hallticketno,Certificate certificate,College college) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.hallticketno = hallticketno;
		this.certificate=certificate;
		this.college=college;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getMarks() 
	{
		return marks;
	}
	public void setMarks(double marks) 
	{
		this.marks = marks;
	}
	public String getQualification() 
	{
		return qualification;
	}
	public void setQualification(String qualification) 
	{
		this.qualification = qualification;
	}
	public String getCourse() 
	{
		return course;
	}
	public void setCourse(String course) 
	{
		this.course = course;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public int getHallticketno() 
	{
		return hallticketno;
	}
	public void setHallticketno(int hallticketno) 
	{
		this.hallticketno = hallticketno;
	}
	public Certificate getCertificate()
	{
		return certificate;
	}
	public void setCertificate(Certificate certificate)
	{
		this.certificate=certificate;
	}
	public College getCollage()
	{
		return college;
	}
	public void setCollage(College college)
	{
		this.college=college;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", qualification=" + qualification
				+ ", course=" + course + ", year=" + year + ", hallticketno=" + hallticketno + ", certificate="
				+ certificate + ", college=" + college + "]";
	}
	
	

}
