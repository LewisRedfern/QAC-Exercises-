package Intermediate;

public class People {

	private String name;
	private String occupation;
	private int age;
	
	public People (String name, String occupation, int age) {
		
		this.name = name;
		this.occupation = occupation;
		this.age = age;
	}
	
	public String getname(){
		return name;
	}
	public String getoccupation() {
		return occupation;
	}
	public int age() {
		return age;
	}
	
	public String strMaker() {
		
		return ("Name: " + name + " | Occupation: " + occupation + " | Age: " + age + ".");
	}
}
