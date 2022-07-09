package kunal;

import java.util.Scanner;

class CalculatorMethod {

	double addition(double number1, double number2) {
		return number1 + number2;
	}

	double subtraction(double number1, double number2) {
		return number1 - number2;
	}

	double multiplication(double number1, double number2) {
		return number1 * number2;
	}

	double division(double number1, double number2) {
		return number1 / number2;
	}

	double modulus(double number1, double number2) {
		return number1 % number2;
	}

	double percentage(double number1, double number2) {
		return (number1 * number2) / 100;
	}
}

public class Calculator extends CalculatorMethod {

	public static void main(String args[]) {

		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number");
		double number1 = scanner.nextDouble();
		System.out.println("Enter second number");
		double number2 = scanner.nextDouble();

		while (true) {
			boolean isExit = false;
			System.out.println("Enter 1 for addition");
			System.out.println("Enter 2 for subtraction");
			System.out.println("Enter 3 for multiplication");
			System.out.println("Enter 4 for division");
			System.out.println("Enter 5 for modulus");
			System.out.println("Enter 6 for percentage");
			System.out.println("Enter 0 to exit.");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println(calculator.addition(number1, number2));
				break;
			case 2:
				System.out.println(calculator.subtraction(number1, number2));
				break;
			case 3:
				System.out.println(calculator.multiplication(number1, number2));
				break;
			case 4:
				System.out.println(calculator.division(number1, number2));
				break;
			case 5:
				System.out.println(calculator.modulus(number1, number2));
				break;
			case 6:
				System.out.println(calculator.percentage(number1, number2));
				break;
			case 0:
				isExit = true;
				break;
			default:
				System.out.println("Try again");
				break;

			}
			if (isExit) {
				System.out.println("Thank You.");
				break;
			}
		}

		scanner.close();
	}
}
