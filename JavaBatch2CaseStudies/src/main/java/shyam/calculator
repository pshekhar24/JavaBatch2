package assenment;

import java.util.Scanner;

class ArithmaticOperation {
	static double input1, input2;
	static Scanner scanner = new Scanner(System.in);

	void input() {
		System.out.println("Enter the first input");
		input1 = scanner.nextDouble();
		System.out.println("Enter the second input");
		input2 = scanner.nextDouble();

	}

	double addition(double input1, double input2) {
		return input1 + input2;

	}

	double substraction(double input1, double input2) {
		return input1 - input2;

	}

	double multiplication(double input1, double input2) {
		return input1 * input2;

	}

	double divide(double input1, double input2) {
		return input1 / input2;

	}

	double modeperation(double input1, double input2) {
		return input1 % input2;

	}

	double persent(double input1, double input2) {
		return (input1 * input2) / 100;

	}

}

public class Calculator extends ArithmaticOperation {

	public static void main(String[] args) {
		Calculator obj = new Calculator();

		while (true) {
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for substraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for divide");
			System.out.println("Press 5 for modeperation");
			System.out.println("Press 6 for %");
			int n = scanner.nextInt();
			switch (n) {

			case 1:
				obj.input();
				System.out.println("addiion:" + obj.addition(input1, input2));
				break;

			case 2:
				obj.input();
				System.out.println("subtraction:" + obj.substraction(input1, input2));
				break;

			case 3:
				obj.input();
				System.out.println("multiplication:" + obj.multiplication(input1, input2));
				break;

			case 4:
				obj.input();
				System.out.println("divide:" + obj.divide(input1, input2));
				break;

			case 5:
				obj.input();
				System.out.println("modeperation:" + obj.modeperation(input1, input2));
				break;

			case 6:

				obj.input();
				System.out.println("%:" + obj.persent(input1, input2));
				break;
			}

		}
	}
}
