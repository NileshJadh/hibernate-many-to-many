package com.rocky.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Students {

	@Id
	@Column(name="students_id")
	private Integer id;
	
	private String city;
	
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Courses> courses;
	
	
	
	public Set<Courses> getCourses() {
		return courses;
	}

	public void setCourses(Set<Courses> courses) {
		this.courses = courses;
	}

	public Students() {
		
		System.out.println("Zero Param Constructor of Students");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", city=" + city + ", name=" + name + ",courses=" + courses + "]";
	}
	
	
	
}
