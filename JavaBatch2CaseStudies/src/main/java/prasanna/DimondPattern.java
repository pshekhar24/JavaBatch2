package prasanna;

import java.util.Scanner;

public class DimondPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows:");		
		int totalRow = scanner.nextInt();
		System.out.println("char 1:");
		int a=scanner.nextInt();
		System.out.println("char 2:");
		int b=scanner.nextInt();	
		int row,c=a;
		
		// prints the first half diamond
		for ( row = 1; row <= (totalRow + 1) / 2; row++) {
			c = print(row,totalRow,a,b,c);         // method to  prints space and char		
			System.out.println();				 // Ending line after each row
		}

		// Prints the second half diamond
		for (row = (totalRow) / 2; row >= 0; row--) {
			c = print(row,totalRow,a,b,c);		 // method to  prints  space and char
			System.out.println(); 				// Ending line after each row
		}
		scanner.close();
	}

	private static int print(int row,int totalRow, int a,int b,int c) {
		// print whitespaces	
		for (int space = row; space <= totalRow / 2; space++) {
			System.out.print(" ");
		}
		// Inner loop print char
		for (int n = 1; n <= row * 2 - 1; n++) {
			if ( c == a) {
				System.out.print(a);
				 c=b;
			} else if(c==b) {
				System.out.print(b);
				c=a;
			}
		}
		return c;
	}
  
}
