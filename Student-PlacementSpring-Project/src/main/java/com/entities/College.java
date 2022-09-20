package com.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="college")

public class College implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String collegeName;
	private String location;
	
	
	@OneToOne(mappedBy = "college",orphanRemoval = true)
	private User user;
	
	
	@OneToMany(mappedBy="college",orphanRemoval = true)
	private Set<Student> student;
	
	
	@OneToMany(mappedBy="college",orphanRemoval = true)
	private Set<Placement> placement;
	
	
	@OneToMany(mappedBy="college",orphanRemoval = true)
	private Set<Certificate> certificate;
	
	
	public College() {
	
	}
	
	public College(int id, String collegeName, String location, User user, Set<Student> student,
			Set<Placement> placement, Set<Certificate> certificate) {
		this.id = id;
		this.collegeName = collegeName;
		this.location = location;
		this.user = user;
		this.student = student;
		this.placement = placement;
		this.certificate = certificate;
	}

	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getcollegeName()
	{
		return collegeName;
	}
	public void setcollegeName(String collegeName)
	{
		this.collegeName = collegeName;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Set<Student> getStudent() 
	{
		return student;
	}

	public void setStudent(Set<Student> student)
	{
		this.student = student;
	}
	
	public Set<Placement> getPlacement()
	{
		return placement;
	}

	public void setPlacement(Set<Placement> placement) 
	{
		this.placement = placement;
	}
	
	public Set<Certificate> getCertificate() 
	{
		return certificate;
	}

	public void setCertificate(Set<Certificate> certificate) 
	{
		this.certificate = certificate;
	}
	
	@Override
	public String toString() {
		return "college [id=" + id + ", collegeName=" + collegeName + ", location="
				+ location + ", user=" + user + ", student=" + student + ", placement=" + placement + ", certificate="
				+ certificate + "]";
	}
	
	
	
	
	

}
