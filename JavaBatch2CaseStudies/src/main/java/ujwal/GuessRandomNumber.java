package programs.com;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int RandomNumber=new Random().nextInt(RandomNumber=50);
		System.out.println(RandomNumber);
		System.out.println("guess the Random number?");
		int attempts=1;
		boolean option = false;
		while(option==false) {
			int guess=sc.nextInt();
			if(guess>RandomNumber) {
				System.out.println("Number is too high--try again");
				attempts++;
			}
			else if(guess<RandomNumber){
				System.out.println("Number is too low--try again");
				attempts++;
			}
			else {
				System.out.println("your guess is right"+" "+"and Number of attempts is:"+attempts);
				option=true;
			}
		}
		sc.close();
	}
}
