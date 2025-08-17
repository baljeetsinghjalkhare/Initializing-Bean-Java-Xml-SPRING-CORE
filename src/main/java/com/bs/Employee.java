//different types of bean configuration


package com.bs;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;
import lombok.ToString; 

@Data
@ToString(exclude = {"kids","education","projects","addresses"})
public class Employee {
private int Eno;
private String Name;

//non-premitive
private Address address;
private Set<String> emails;//duplicate not allowed
//private List<String> emails;
private List<String> hobbies;
private Map<String,Integer> kids;
private Properties education;

private List<Project> projects;
private Map<String,Address> addresses;

public Employee(int eno, String name, Address address) {

	System.out.println("three Args Constructor");
	Eno = eno;
	Name = name;
	this.address = address;
}

public Employee()
{
	System.out.println("Zero Args Constructor");
}

public Employee(int eno, String name, Address address, Set<String> emails) {
	System.out.println("Four Args Constructor (Set type).......");
	Eno = eno;
	Name = name;
	this.address = address;
	this.emails = emails;
}

public Employee(int eno, String name, Address address, List<String> hobbies) {
    System.out.println("four args constructor (list type)......");
	Eno = eno;
	Name = name;
	this.address = address;
	this.hobbies = hobbies;
}


}
