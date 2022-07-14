package assenment;

import java.util.Scanner;

public class Pattern {
	static int i;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = scanner.nextInt();

		System.out.println("Enter the inputs how to print :");

		int Char1 = scanner.nextInt(); // input 1
		int Char2 = scanner.nextInt(); // input 2

		for (i = 1; i <= rows / 2 + 1; i++) {
			for (int space = 1; space <= (rows / 2 + 1) - i; space++) {
				System.out.print(" ");
			}
			method(Char1, Char2);

		}
		// .....................

		for (i = rows / 2; i >= 1; i--) {
			for (int space = 1; space <= (rows / 2 + 1) - i; space++) {
				System.out.print(" ");
			}
			method(Char1, Char2);

		}
		scanner.close();

	}

	private static void method(int Char1, int Char2) {

		for (int k = i; k >= 1; k--) {
			if (k % 2 == 0) {
				System.out.print(Char2);
			} else {
				System.out.print(Char1);
			}
		}
		for (int l = 2; l <= i; l++) {
			if (l % 2 == 0) {
				System.out.print(Char2);
			} else {
				System.out.print(Char1);
			}
		}
		System.out.println();

	}

}
