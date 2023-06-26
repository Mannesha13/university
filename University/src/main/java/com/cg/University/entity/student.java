package com.cg.University.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	@Id
 private String rollNo;
 private String name;
 private String course;
 private int marks;
public String getRollNo() {
	return rollNo;
}
public void setRollNo(String rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public student(String rollNo, String name, String course, int marks) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.course = course;
	this.marks = marks;
}
@Override
public String toString() {
	return "student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
}
  
}
