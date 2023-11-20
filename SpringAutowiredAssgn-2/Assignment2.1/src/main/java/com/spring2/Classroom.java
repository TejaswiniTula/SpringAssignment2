package com.spring2;

import org.springframework.beans.factory.annotation.Autowired;

public class Classroom {
	@Autowired
	private Student student;

	@Autowired
	public Classroom(Student student) {
		this.student = student;
	}

	public void displayStudentDetails() {
		System.out.println(student.toString());
	}

	public Student getStudent() {
		return student;
	}

	public void setSt(Student student) {
		this.student = student;
	}

}
