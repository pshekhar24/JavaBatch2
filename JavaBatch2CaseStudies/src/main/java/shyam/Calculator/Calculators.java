package Calculator;

import java.util.Scanner;

public class Calculators {

	public static void main(String[] args) {
		ArithmeticOperations sc = new ArithmeticOperations();

		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();

		while (true) {
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for substraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for divide");
			System.out.println("Press 5 for modeperation");
			System.out.println("Press 6 for ");
			int n = scanner.nextInt();
			switch (n) {

			case 1:

				System.out.println(sc.addition(input1, input2));

				break;

			case 2:

				System.out.println(sc.substraction(input1, input2));
				break;

			case 3:

				System.out.println(sc.multiplication(input1, input2));
				break;

			case 4:

				System.out.println(sc.dividetion(input1, input2));
				break;

			case 5:

				System.out.println(sc.modulation(input1, input2));
				break;

			case 6:

				System.out.println("%:");
				break;
			}

		}
	}
}
