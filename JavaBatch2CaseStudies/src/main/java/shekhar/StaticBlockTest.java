package shekhar;

public class StaticBlockTest {
	
	static int i = 0;
	
	static {
		i = 50;
		System.out.println("I am executing this block");
	}
	
	public StaticBlockTest() {
		System.out.println("In am in constructor");
		System.out.println(i);
	}
	
	public static void print() {
		System.out.println(i);
	}

}
