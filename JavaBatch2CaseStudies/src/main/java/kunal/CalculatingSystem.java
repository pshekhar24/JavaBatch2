package kunal;

import java.util.*;


class Addition implements InterfaceCalculator {

	public void calculate(double a, double b) {
		System.out.println(a + b);
	}
}

class Subtraction implements InterfaceCalculator {

	public void calculate(double a, double b) {
		System.out.println(a - b);
	}
}

class Multiplication implements InterfaceCalculator {

	public void calculate(double a, double b) {
		System.out.println(a * b);
	}
}

class Division implements InterfaceCalculator {

	public void calculate(double a, double b) {
		System.out.println(a / b);
	}
}

class Modulus implements InterfaceCalculator {

	public void calculate(double a, double b) {
		System.out.println(a % b);
	}
}

class Percentage implements InterfaceCalculator {

	public void calculate(double a, double b) {
		System.out.println((a * b) / 100);
	}
}

public class CalculatingSystem {
	static void calculateMethod(InterfaceCalculator object, double a, double b) {
		object.calculate(a, b);
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number: ");
		double firstNumber = scanner.nextDouble();
		System.out.println("Enter second number: ");
		double secondNumber = scanner.nextDouble();

		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for subtraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4 for division");
		System.out.println("Enter 5 for modulus");
		System.out.println("Enter 6 for percentage");
		short choice = scanner.nextShort();
		switch (choice) {
		case 1:
			calculateMethod(new Addition(), firstNumber, secondNumber);
			break;
		case 2:
			calculateMethod(new Subtraction(), firstNumber, secondNumber);
			break;
		case 3:
			calculateMethod(new Multiplication(), firstNumber, secondNumber);
			break;
		case 4:
			calculateMethod(new Division(), firstNumber, secondNumber);
			break;
		case 5:
			calculateMethod(new Modulus(), firstNumber, secondNumber);
			break;
		case 6:
			calculateMethod(new Percentage(), firstNumber, secondNumber);
			break;
		default:
			System.out.println("Wrong Choice.");
			break;

		}

		scanner.close();
	}
}
