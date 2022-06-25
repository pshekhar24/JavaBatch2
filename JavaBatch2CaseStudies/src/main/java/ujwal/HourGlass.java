package programs.com;
import java.util.Scanner;
public class HourGlass
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number of patterns to print:"); 
		Scanner sc =new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input%2!=0) 
		{ 
			for(int i=1; i<=input; i++){ 
				if(i % 2 == 0){
					continue;
			   }
				for(int k=2; k<=i-((i/2)); k++){
					System.out.print(" ");
				}
	        
				for(int j=1; j<=input-i+1; j++){ 
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=input-1; i>=1; i--){
				if(i % 2 == 0){
					continue;
				}
				
				for(int k=2; k<=i-((i/2)); k++){
					System.out.print(" ");
				}
				for(int j=i; j<=input; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("only odd number is alowed");
		}
		sc.close();
	}
}
