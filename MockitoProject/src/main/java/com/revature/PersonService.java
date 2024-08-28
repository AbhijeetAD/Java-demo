package com.revature;


import java.util.Collections;
import java.util.List;

public class PersonService {
private PersonRepository repository;


public PersonService() {
	this.repository=new PersonRepository();
	}
public List<String> sort(){
	System.out.println("Person Service: Sort()");
List<String> users=this.repository.findAll();
Collections.sort(users);
return users;
}
}
