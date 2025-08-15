package com.bs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee emp=context.getBean("e1",Employee.class);
//		emp.setAddress(new Address(101,"Dsd","harda"));
//		Address adr=context.getBean("adr1",Address.class);
//		emp.setAddress(adr);
		
		System.out.println(emp);

	}

}
