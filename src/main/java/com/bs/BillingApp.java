package com.bs;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BillingApp {
public static void main(String ar[])
{
	ApplicationContext context=new ClassPathXmlApplicationContext("billinfo.xml");
	Bill bill=context.getBean("bill",Bill.class);

	System.out.println(bill);
	
	
}
}
