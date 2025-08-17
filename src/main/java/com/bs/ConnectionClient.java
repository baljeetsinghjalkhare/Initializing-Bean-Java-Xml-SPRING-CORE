package com.bs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("scopetest.xml");
		
		Connection con=context.getBean("con",Connection.class);
		Connection con2=context.getBean("con",Connection.class);
		

	}

}
