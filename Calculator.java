package testExam;

import java.util.Scanner;

class ArithmaticOperation {
	static int input1, input2;
	static Scanner scanner = new Scanner(System.in);

	void input() {
		System.out.println("Enter the First Number");
		input1 = scanner.nextInt();
		System.out.println("Enter the Second Number");
		input2 = scanner.nextInt();
	}

	int addition(int input1, int input2) {
		return input1 + input2;
	}

	int substraction(int input1, int input2) {
		return input1 - input2;
	}

	int multiplication(int input1, int input2) {
		return input1 * input2;
	}

	int division(int input1, int input2) {
		return input1 / input2;
	}

	int modules(int input1, int input2) {
		return input1 % input2;
	}

	int percentage(int input1, int input2) {
		return ((input1 * input2) / 100);
	}
}

public class Calculator extends ArithmaticOperation {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		while (true) {
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Substraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for Modulus(%)");
			System.out.println("Press 6 for Percentage");
			System.out.println("Press 0 for Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				calculator.input();
				System.out.println("Addiion = " + calculator.addition(input1, input2));
				break;
			case 2:
				calculator.input();
				System.out.println("Subtraction = " + calculator.substraction(input1, input2));
				break;
			case 3:
				calculator.input();
				System.out.println("Multiplication = " + calculator.multiplication(input1, input2));
				break;
			case 4:
				calculator.input();
				System.out.println("Division = " + calculator.division(input1, input2));
				break;
			case 5:
				calculator.input();
				System.out.println("Modulus(%) = " + calculator.modules(input1, input2));
				break;
			case 6:
				calculator.input();
				System.out.println("Percentage = " + calculator.percentage(input1, input2));
				break;
			case 0:
				System.out.println("Exit | Thank You");
				System.exit(choice);
			default:
				System.out.println("Please Choose Correct Option:");
				break;
			}
		}
	}
}
