package com.revature;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
public PersonService personService;
@Test
public void testSort() {
	this.personService=new PersonService();
List<String> sortedNames=this.personService.sort();
System.out.println(sortedNames);
Assertions.assertEquals("Jasdhir",sortedNames.get(2));
}

}
