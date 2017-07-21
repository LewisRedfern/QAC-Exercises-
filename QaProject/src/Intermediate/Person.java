package Intermediate;

public class Person {

	private String name;
	private int age;
	private String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		
		//this. means that the global variable is used. not the one in the method.
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public String strMaker() {
		
		return ("Name: " + name + " | Age: " + age + " | Job Title: " + jobTitle);
	}
}
