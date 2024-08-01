package com.revature.com;

public class PersonManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Person();
p.setAge(19);
p.setName("Abhijeet");
String eligiblity="Not eligible";
try
{
	eligiblity=p.eligible(p.getAge());
}catch(InvalidAgeException e)

{
e.getStackTrace()	;
}
System.out.println("Eligibility to Vote:"+eligiblity);
	}

}
