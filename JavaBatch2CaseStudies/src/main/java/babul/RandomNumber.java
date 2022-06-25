package testExam;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(50);
		int count=1;
		Scanner scanner=new Scanner(System.in);
		while (true) {
			System.out.println("Enter number:");
			int choice=scanner.nextInt();
			
			if (randomNumber < choice) {
				System.out.println("Number is too high,try again");
				count++;
			} else if (randomNumber > choice) {
				System.out.println("Number is too low,try again");
				count++;
			}else {
				System.out.println("it's correct Number is: "+randomNumber);
				System.out.println("You took to guess in "+count+ " times");
				break;
			}
			
	    }
		scanner.close();
	}
}
