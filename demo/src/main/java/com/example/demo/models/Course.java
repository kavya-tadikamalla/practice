package com.example.demo.models;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Course 
{
	@Id
	@GeneratedValue
	@Column
private int courseId;
	@Column
private String courseName;
	@Column
private int duration;
	@Column
private double price;
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Course() {
	super();
}
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", price=" + price
			+ "]";
}

}