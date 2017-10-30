
public class Animal {
	
	int age;
	String gender;
	
	// this is a constructor 
	public Animal(int age, String gender) {
		super();
		this.age = age;
		this.gender = gender;
	}
	
	// these are the behaviors of our Animal
	public void eat() {
		System.out.println("I am eating");
	}
	
	public void sleep() {
		System.out.println("I am sleeping");
	}
	
	

}
