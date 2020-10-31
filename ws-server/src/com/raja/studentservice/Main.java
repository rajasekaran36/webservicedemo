package com.raja.studentservice;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:5000/student/get/details", new StudentOpearationsImpl());
		System.out.println("service published");
	}

}
