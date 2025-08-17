package com.bs;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
@Data
public class Autowire {
    private int rno;
	private String name;
	@Autowired  
//	@Qualifier("addresses")
	private Address addresses;
	@Autowired
//	@Qualifier("prj2")
	private Project projects;
	
	@Autowired
	private MyCountry mycountry;
	
}
