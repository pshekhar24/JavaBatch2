package rashmi;

import java.util.Scanner;

public class Calculator extends SimpleCalculator {
	Calculator(int a, int b) {
		super(a, b);

	}

	public static void main(String args[]) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value:");
		a = scanner.nextInt();
		System.out.println("enter b Value:");
		b = scanner.nextInt();
		System.out.println("Choices are here:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Percentage");
		System.out.println("6. Modulous");
		System.out.println("Enter Your Choice");
		int operation = scanner.nextInt();
		switch (operation) {
		case 1:
			c = a + b;
			System.out.println("Addition = " + c);
			break;
		case 2:
			c = a - b;
			System.out.println("Subtraction = " + c);
			break;
		case 3:
			c = a * b;
			System.out.println("Multiplication = " + c);
			break;
		case 4:
			c = a / b;
			System.out.println("Division = " + c);
			break;
		case 5:
			c = a * 100 / b;
			System.out.println("Percentage = " + c);
			break;
		case 6:
			c = a % b;
			System.out.println("Modulous = " + c);
			break;
		default:
			System.out.println("You have entered wrong choice");
			scanner.close();
		}
	}
}
