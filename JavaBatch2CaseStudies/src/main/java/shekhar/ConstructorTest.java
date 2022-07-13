package shekhar;

public class ConstructorTest {
	
	//Parameterized constructor
	public ConstructorTest(int number) {
		//new ConstructorTest();// creates a new obj
		//this(); // will call the constructor
		System.out.println("Arg Constuctor");
	}
	
	//no arg constructor
	public ConstructorTest() {
		this(10); 
		System.out.println("No Arg Constructor");
		
	}
	
	public static void main(String[] args) {
		ConstructorTest constructorTest = new ConstructorTest();

	}

}
