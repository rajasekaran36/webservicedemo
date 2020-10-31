package com.raja.studentservice;

import javax.jws.WebService;


@WebService
public class StudentOpearationsImpl implements StudentOperations{
	
	@Override
	public Student getStudentById(int id) {
		Student aStudent = new Student(1, "rajasekaran");
		return aStudent;
	}

	@Override
	public String getStudentNameById(int id) {
		return "rajasekaran";
	}

}
