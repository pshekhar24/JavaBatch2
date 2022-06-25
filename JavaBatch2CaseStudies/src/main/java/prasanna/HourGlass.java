package prasanna;
import java.util.Scanner;

public class HourGlass {	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the value of rows");
			int rows =scanner.nextInt();
				//upper half
			if (rows % 2 == 1) {
				for (int i = 1; i <=rows; i++) {
					if (i % 2 == 0) {
						continue;
					}
					for (int space = 2; space <=i-(i/2); space++) {
						System.out.print(" ");
					}
					for (int print = 0; print <= rows - i  ; print++) {
						System.out.print("*");
					}
					System.out.println();
				}
					// lower half
				for (int i = rows - 1; i >= 1; i--) {
					if (i % 2 == 0) {
						continue;
					}
					for (int space = i-2; space >= i/2; space--) {
						System.out.print(" ");
					}
					for (int print = i; print <= rows; print++)
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
