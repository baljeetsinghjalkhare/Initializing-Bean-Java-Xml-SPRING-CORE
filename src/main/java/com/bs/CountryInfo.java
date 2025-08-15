package com.bs;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class CountryInfo {
private int code;
private String name;

public CountryInfo(int code, String name)
{
	this.code=code;
	this.name=name;
	
}
//public static CountryInfo getCountryInfo() {
//	CountryInfo info=new CountryInfo(101,"india");
//	return info;
//}

}
