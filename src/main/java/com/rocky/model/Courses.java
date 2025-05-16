package com.rocky.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courses {

	@Id
	@Column(name="courses_id")
	private Integer id;
	
	private String courseName;
	
	private Integer coursePrice;
	
	public Courses() {
		
		System.out.println("Zero Param Constructor of cources ");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(Integer coursePrice) {
		this.coursePrice = coursePrice;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", courseName=" + courseName + ", coursePrice=" + coursePrice + "]";
	}
	
	
	
	
}
