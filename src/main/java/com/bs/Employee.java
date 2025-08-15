//different types of bean configuration


package com.bs;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;
import lombok.ToString; 

@Data
@ToString(exclude = {"address","Name","address","emails","kids"})
public class Employee {
private int Eno;
private String Name;

//non-premitive
private Address address;
private Set<String> emails;//duplicate not allowed
//private List<String> emails;

private Map<String,Integer> kids;
private Properties education;

private List<Project> projects;
private Map<String,Address> addresses;


}
