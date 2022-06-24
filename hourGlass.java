package test;

import java.util.Scanner;

public class hourGlass {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the value");
			int n =scanner.nextInt();
				//upper half
			if (n % 2 == 1) {
				for (int i = 1; i <=n; i++) {
					if (i % 2 == 0) {
						continue;
					}
					for (int k = 2; k <=i-(i/2); k++) {
						System.out.print(" ");
					}
					for (int j = 0; j <= n - i  ; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
					// lower half
				for (int i = n - 1; i >= 1; i--) {
					if (i % 2 == 0) {
						continue;
					}
					for (int k = i-2; k >= i/2; k--) {
						System.out.print(" ");
					}
					for (int j = i; j <= n; j++)

					{
						System.out.print("*");

					}
					System.out.println();
				}

			} else {
				System.out.println(" only odd number try again!! ");

			}
			scanner.close();

		}
	
}
