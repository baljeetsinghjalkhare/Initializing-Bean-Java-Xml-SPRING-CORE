package com.bs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireClient {

	public static void main(String[] args) {
		
	    ApplicationContext context=new ClassPathXmlApplicationContext("autowire.xml");
	    
        Autowire auto=context.getBean("auto",Autowire.class);
        System.out.println(auto);
	}

}
