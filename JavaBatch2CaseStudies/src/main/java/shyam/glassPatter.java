import java.util.Scanner;

public class GlassPattern {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input % 2 == 1) {

			for (int i = 1; i <= input; i++) {
				for (int space = 1; space < i; space++) {
					System.out.print("  ");
					space++;
				}
				for (int star = i; star <= input; star++) {
					System.out.print(" *");
				}
				System.out.println();
				i++;
			}

			for (int i = input - 1; i >= 1; i--) {
				i--;
				for (int space = 1; space < i; space++) {
					System.out.print("  ");
					space++;
				}
				for (int star = i; star <= input; star++) {
					System.out.print(" *");
				}

				System.out.println();
			}

		} else {
			System.out.println("plz enter the odd input:");
		}

	}

}
