package com.bs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryInfoClient {
	public static void main(String ar[])
	{
//		CountryInfo info=CountryInfo.getCountryInfo();
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		CountryInfo info=context.getBean("info",CountryInfo.class);
		System.out.print(info);
	}

}
