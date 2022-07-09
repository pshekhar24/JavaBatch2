package shekhar.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println(test());
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter any integer");
		try { 
			int x = scanner.nextInt();
			validateInput(x);
			System.out.println("You have entered " + x);
			
		} catch (InputMismatchException e) {
			System.out.println("Inputmissmatch Invalid input, please try adding only integer numbers and try again");
		} catch (Exception e) {
			System.out.println("Default Invalid input, please try adding only integer numbers and try again");
		} finally {
			System.out.println("closing the scanner");
			scanner.close();
		}
		System.out.println("executing next lines of program");
		
		
		/*
		 *  try {
		 *  }catch(Exception e) {
		 *  }
		 */
		
	}

	private static void validateInput(int x) throws CustomException, ArithmeticException {
		if (x > 5) {
			throw new CustomException("This exception is thrown because you entered number greather than 5");
		}
	}

	
	private static int test() {
		try {
			return 10;
		} finally {
			System.out.println("executing finally");
		}
	}
}
