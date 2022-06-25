package programs.com;
import java.util.Scanner;
public class BankTeleCaller
{
	public static void main(String[] args) {
        mainMenu();
    }
    private static void mainMenu() {
        System.out.println("press 0 to exit\n" + "press 1 for Loans\n" +"press 2 for Saving\n" + "press 3 for Current\n"+"press 4 for cards\n");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 0:
                System.out.println("Stop Processing");
                break;
            case 1:
                loans();
                break;
            case 2:
                savingAccount();
                break;
            case 3:
                currentAccount();
                break;
            case 4:
            	cards();
            	break;
        }
        scanner.close();
    }
    private static void savingAccount() {
        System.out.println("please enter your savings account number");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if(a.matches("\\d{8}")){
            System.out.println("Thank you for account number\n" +"press 1 to show account balance\n"+ "press 2 to speak customer care\n" +"press 9 to go back to previous menu");
            int x = scanner.nextInt();
            switch (x){
                case 1:
                    System.out.println("show account balance");
                    break;
                case 2:
                    System.out.println("customer care Number 123445676");
                    break;
                case 3:
                    mainMenu();
                    break;
                case 9:
                	mainMenu();
                	break;
            }
        }
        else {
            System.out.println("Invalid account number, Press 0 to try again or Press 9 to go back to previous menu");
            Scanner scanner1 = new Scanner(System.in);
            int b = scanner1.nextInt();
            if( b == 0) {
                savingAccount();
            }
            else if(b==9) {
            	mainMenu();
            }
            scanner1.close();
        }
        scanner.close();
    }
    private static void loans() {
        System.out.println("press 1 for personal loan\n" +"press 2 for housing loan\n" +"press 3 for car loan\n" +"press 4 for gold loan\n" +"press 9 to go back to previous menu");
        Scanner scanner = new Scanner(System.in);
        int Input = scanner.nextInt();

        switch (Input){
            case 1:
                System.out.println("personal loan");
                break;
            case 2:
                System.out.println("housing loan");
                break;
            case 3:
                System.out.println("car loan");
                break;
            case 4:
                System.out.println("gold loan");
                break;
            case 9:
                mainMenu();
                break;
        }
        scanner.close();
    }
    private static void currentAccount() {
    	System.out.println("please enter your current account number");
    	Scanner scanner =new Scanner(System.in);
    	String  a=scanner.nextLine();
    	
    	if(a.matches("\\d{8}")) {
    		System.out.println("Thank you for account number\n" +"press 1 to show account balance\n"+ "press 2 to speak customer care\n" +"press 9 to go back to previous menu");
    		int y=scanner.nextInt();
    		switch(y){
    		case 1:
    			System.out.println("show account balance");
    			break;
    		case 2:
    			System.out.println("customer care number 123456789");
    		    break;
    		case 3:
    			mainMenu();
    			break;
    		 case 9:
                 mainMenu();
                 break;	
    		}
    	}
    	else {
            System.out.println("Invalid account number, Press 0 to try again or Press 9 to go back to previous number");
            Scanner scanner1 = new Scanner(System.in);
            int b = scanner1.nextInt();
            if( b == 0) {
                currentAccount();
            }
            else if(b==9) {
            	mainMenu();
            }
            scanner1.close();
        }
    	scanner.close();
    }
    private static void cards() {
    	System.out.println("press 1 for credit card\n"+"press 2 for debit card\n");
    	Scanner scanner= new Scanner(System.in);
        int input = scanner.nextInt();
    			switch(input) {
    			case 1:
    				creditCard();
    				break;
    			case 2:
    				debitCard();
    			    break;	
    			}
    			scanner.close();
    	}
    private static void creditCard() {
    	System.out.println("please enter your debit card number");
    	Scanner scanner =new Scanner(System.in);
    	String  a=scanner.nextLine();
    	
    	if(a.matches("\\d{16}")) {
    		System.out.println("Thank you for account number\n" +"press 1 to block your card\n"+ "press 2 to speak customer care\n" +"press 9 to go back to previous menu");
    		int y=scanner.nextInt();
    		switch(y){
    		case 1:
    			System.out.println("card is blocked");
    			break;
    		case 2:
    			System.out.println("customer care number 123456789");
    		    break;
    		 case 9:
                 mainMenu();
                 break;	
    		}
    	}
    	else {
            System.out.println("Invalid account number, Press 0 to try again or Press 9 to go back to previous number");
            Scanner scanner1 = new Scanner(System.in);
            int b = scanner1.nextInt();
            if( b == 0) {
                creditCard();
            }
            else if(b==9) {
            	mainMenu();
            }
            scanner1.close();
    	}
    	scanner.close();
	}
	private static void debitCard() {
		System.out.println("please enter your credit card number");
    	Scanner scanner =new Scanner(System.in);
    	String  a=scanner.nextLine();
    	if(a.matches("\\d{16}")) {
    		System.out.println("Thank you for account number\n" +"press 1 to block your card\n"+ "press 2 to speak customer care\n" +"press 9 to go back to previous menu");
    		int y=scanner.nextInt();
    		switch(y){
    		case 1:
    			System.out.println("card is blokced");
    			break;
    		case 2:
    			System.out.println("customer care number 123456789");
    		    break;
    		 case 9:
                 mainMenu();
                 break;     
    		}
    	}
    	else {
            System.out.println("Invalid account number, Press 0 to try again or Press 9 to go back to previous number");
            Scanner scanner1 = new Scanner(System.in);
            int b = scanner1.nextInt();
            if( b == 0) {
                debitCard();
            }
            else if(b==9) {
            	mainMenu();
            }
            scanner1.close(); 
    }
  	scanner.close();
	}	
}
