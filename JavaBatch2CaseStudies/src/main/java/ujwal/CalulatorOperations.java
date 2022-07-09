package programs.com;

import java.util.Scanner;

class Operation {
	static double value1, value2;
	static Scanner sc = new Scanner(System.in);

	void operation() {
		System.out.println("please provide first value");
		value1 = sc.nextDouble();
		System.out.println("please provide second value");
		value2 = sc.nextDouble();

	}

	double addition(double value1, double value2) {
		return value1 + value2;

	}

	double substraction(double value1, double value2) {
		return value1 - value2;

	}

	double multiplication(double value1, double value2) {
		return value1 * value2;

	}

	double divide(double value1, double value2) {
		return value1 / value2;

	}

	double modeperation(double value1, double value2) {
		return (value1 * value2) / 100;

	}

	double percentage(double value1, double value2) {
		return value1 % value2;

	}

}

public class CalulatorOperations extends Operation {

	public static void main(String[] args) {
		 Operation op = new  Operation();

		while (true) {
			System.out.println("Press 1 for addition Operation ");
			System.out.println("Press 2 for substraction Opweration");
			System.out.println("Press 3 for multiplication Operation");
			System.out.println("Press 4 for divide Operation");
			System.out.println("Press 5 for Percentage Operation");
			System.out.println("Press 6 for mode Operation");
			System.out.println("--------------------------------------");
			int n = sc.nextInt();
			switch (n) {

			case 1:
				op.operation();
				System.out.println("addition of first value and second value is  " + op.addition(value1, value2));
				break;

			case 2:
				op.operation();
				System.out.println("subtraction of first value and second value is" + op.substraction(value1, value2));
				break;

			case 3:
				op.operation();
				System.out.println("multiplication of first value and second value is" + op.multiplication(value1, value2));
				break;

			case 4:
				op.operation();
				System.out.println("division of first value and second value is" + op.divide(value1, value2));
				break;
				
			case 5:

				op.operation();
				System.out.println("percentage of first value and second value is" + op.percentage(value1, value2));
				break;
				
			case 6:
				op.operation();
				System.out.println("mode of first value and second value is" + op.modeperation(value1, value2));
				break;
			}
		}
	}
}