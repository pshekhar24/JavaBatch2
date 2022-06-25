
import java.util.Scanner;

public class BankTeleCaller {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("Press 0 to exit ");
			System.out.println("Press 1 for loan ");
			System.out.println("Press 2 for Saving account ");
			System.out.println("Press 3 for Current account ");
			System.out.println("Press 4 for Cards ");
			System.out.println("Press 9 to go back to previous menu ");
			
			int input=scanner.nextInt();
			if (input==0) {
				System.out.println("Exit");
				break;
			}
			
			if (input==1){
				System.out.println("Your loan menu ");
			
			while(true) {
				System.out.println("press 1 for personal loan");
				System.out.println("press 2 for housing loan");
				System.out.println("press 3 for car loan");
				System.out.println("press 4 for gold loan");
				System.out.println("Press 9 to go back to the previous menu");
				break;
			}
			
				int inputOption=scanner.nextInt();
				if (inputOption==1) {
					System.out.println("Your personal loan");	
				}
				else if (inputOption==2) {
					System.out.println("Housing loan");	
				}
				else if (inputOption==3) {
					System.out.println("Your car loan");
				}
				else if(inputOption==4) {
					System.out.println("Gold loan");
				}
				else {
					System.out.println("Press 9 to go back to the previous menu: ");
				}
			}
			
			if (input==2) {
				System.out.println("Please enter account number");
				
				long accountNum=scanner.nextLong();
				String value=String.valueOf(accountNum);
				int length=value.length();
				if(length>=8 && length<=16) {
				
					System.out.println("Thanks for account number");
				}
				else {
					System.out.println("Invalid Account number");
					System.out.println("Press 0 to retry or 9 to previous menu");
					break;
				}
				System.out.println("Your saving account menu");
				
			while(true) {
				System.out.println("Press 1 for show account balance");
				System.out.println("Press 2 to speak customer care");
				System.out.println("Press 9 to go back to the previous menu");
				break;
			}

			int inputOption2=scanner.nextInt();
			if (inputOption2==1) {
				System.out.println("Your Account balance");	
			}
			else if (inputOption2==2) {
				System.out.println("Speak customer care");	
			}
			else {
				System.out.println("Press 9 to go back to the previous menu");
			}
			}
			
			if (input==3) {
				System.out.println("Please enter Current account number");
				
				long accountNumber=scanner.nextLong();
				String value=String.valueOf(accountNumber);
				int length=value.length();
				if (length>=8 && length<=16) {
				
					System.out.println("Thanks for Current account number");
				}
				else {
					System.out.println("Invalid Account number");
					System.out.println("Press 0 to retry or 9 to previous menu");
					break;
				}
				System.out.println("Your current account menu");
			
			while(true) {
				System.out.println("Press 1 to show account balance");
				System.out.println("Press 2 to speak customer care");
				System.out.println("Press 9 to go back to the previous menu");
				break;
			}
			
			int inputOption3=scanner.nextInt();
			if (inputOption3==1) {
				System.out.println("Your current account balance");
			}
			else if (inputOption3==2) {
				System.out.println("Speak customer care");
			}
			else {
				System.out.println("Press 9 to go back to the previous menu");
			}
			}
			
			if (input==4) {
				System.out.println("Your card section");
				
			while(true) {
				System.out.println("Press 1 for credit card");
				System.out.println("Press 2 for debit card");
				break;
			}
			
			int inputOption4=scanner.nextInt();
			if (inputOption4==1) {
				System.out.println("Please enter Credit card number");
				
				long cardNumber=scanner.nextLong();
				String value=String.valueOf(cardNumber);
				int length=value.length();
				if (length==16) {
				
					System.out.println("Thanks for credit card number");
				}
				else {
					System.out.println("Invalid credit card number, Number should be 16-digit");
					System.out.println("Press 0 to try-again or 9 to previous menu");
					continue;
				}
				
				System.out.println("Press 1 to block your card");	
				System.out.println("Press 2 to speak customer care");
				System.out.println("press 9 to go back to the previous menu");
			}
			
			if (inputOption4==2) {
				System.out.println("Please enter debit card number");
				
				long cardNumber=scanner.nextLong();
				String value=String.valueOf(cardNumber);
				int length=value.length();
				if (length==16) {
				
					System.out.println("Thanks for debit card number");
				}
				else {
					System.out.println("Invalid debit card number, Number should be 16-digit");
					System.out.println("Press 0 to try-again or 9 to previous menu");
					continue;
				}
				
				System.out.println("Press 1 to block your debit card");
				System.out.println("Press 2 to speak customer care");
				System.out.println("Press 9 to go back to the previous menu");
			  }
				
			int inputOption5=scanner.nextInt();
			if (inputOption5==1) {
				System.out.println("Your debit card is blocked");
			}
			else if (inputOption5==2) {
				System.out.println("Speak with customer care");
			}
			else {
				System.out.println("Press 9 to go back to the previous menu");
			}
			
			int inputOption6=scanner.nextInt();
			if (inputOption6==1) {
				System.out.println("Your credit card is block");
			}
			else if (inputOption6==2) {
				System.out.println("Speak with customer care");
			}
			else {
				System.out.println("Press 9 to go back to the previous menu");
			}
			}
		}
		scanner.close();	
}
}




