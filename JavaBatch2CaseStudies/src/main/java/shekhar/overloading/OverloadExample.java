package shekhar.overloading;

public class OverloadExample {
	int a = 0;
	int b = 0;
	int c = 0;

	// d = a + b - c

	public void printC(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		calculate();
	}
	
	public void printC(int a, int b) {
		this.a = a;
		this.b = b;
		calculate();
	}

	private void calculate() {
		System.out.println("Value of D is " + (a + b - c));
	}

	public static void main(String[] args) {
		OverloadExample overloadExample = new OverloadExample();
		overloadExample.printC(12, 2, 3);
	}

}
