import java.util.Scanner;

public class HourGlassPattern {
	static void hourGlassMethod(int number)
	{
		for(int i=1; i<=number; i++) 
		{
			for(int k=1; k<i; k++) 
			{
				System.out.print(" ");
			}
			for(int j=i; j<=number; j++) 
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			i++;
		}
		
		for(int i=number-1; i>=1; i--) 
		{
			i--;
			for(int k=1; k<i; k++) 
			{
				System.out.print(" ");
			}
			for(int j=i; j<=number; j++)
			{
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}
	}

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an odd number:");
		
		while(true) {
			int number = scanner.nextInt();
			
			if (number%2 == 0) {
				System.out.println("Entered digit is an even number.Please enter only odd number, Try agin: ");
			}
			else {
				hourGlassMethod(number);
				}
		}
	}
}