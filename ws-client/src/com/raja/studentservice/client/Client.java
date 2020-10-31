package com.raja.studentservice.client;
import com.raja.studentservice.*;
public class Client {

	public static void main(String[] args) {
		StudentOpearationsImpl webservice = new StudentOpearationsImplService().getStudentOpearationsImplPort();
		String studentName = webservice.getStudentNameById(1);
		System.out.println("student name:"+studentName);
		
		Student student = webservice.getStudentById(1);
		
		System.out.println(student.getId());
		System.out.println(student.getName());
	}

}
