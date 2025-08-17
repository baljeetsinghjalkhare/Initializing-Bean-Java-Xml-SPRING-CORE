package com.bs;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MyCountry {
private String name;
private int isd;

public MyCountry()
{
	name="india";
	isd=125;
}
}
