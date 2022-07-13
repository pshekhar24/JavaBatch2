package shekhar.oops.inheritance;

public class ParentChildTest {
	static int x = 20;
	
	public static void main(String[] args) {
		ParentClass parentClass = new ChildClass(50);
		parentClass.printI();
		x = 50;
		
	}

}
