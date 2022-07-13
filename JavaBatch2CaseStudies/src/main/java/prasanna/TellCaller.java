package prasanna;
import java.util.Scanner;

public class TellCaller {
	static Scanner scanner = new Scanner(System.in);

	public static boolean loans(boolean flag) {
		System.out.println("-----------------------------------------------------");
		System.out.println("press 1 for personal loan");
		System.out.println("press 2 for housing loan");
		System.out.println("press 3 for car loan");
		System.out.println("press 4 for gold loan");
		System.out.println("press 9 to go back to previous menu");
		int choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println("welcome to personal loan ");
			flag = false;
		} else if (choice == 2) {
			System.out.println("welcome to housing loan ");
			flag = false;
		} else if (choice == 3) {
			System.out.println("welcome to car loans ");
			flag = false;
		} else if (choice == 4) {
			System.out.println("welcome to gold loans ");
			flag = false;
		} else if (choice == 9) {
			flag = true;
		}
		System.out.println("-----------------------------------------------------");
		return flag;
	}

	private static boolean saving(boolean flag) {
		System.out.println("-----------------------------------------------------");
		System.out.println(" please enter your savings account number");
		String accountNo = scanner.next();
		if (accountNo.matches("\\d{8}")) {
			System.out.println("Thank you for saving account number");
			return flag = operationaccnt(flag);
		} else {
			return flag = tryagainaccnt(flag);
		}
	}
	
	private static boolean operationaccnt(boolean flag) {
		System.out.println("press 1 to show account balance");
		System.out.println("press 2 to speak customer care");
		System.out.println("press 9 to go back to previous menu");
		int sv = scanner.nextInt();
		if (sv == 1) {
			System.out.println("your accnt balance is ****");
			flag = false;
		} else if (sv == 2) {
			System.out.println("this is connecting to customer care");
			flag = false;
		} else if (sv == 9) {
			flag = true;
		}
		System.out.println("-----------------------------------------------------");
		return flag;
	}
	
	private static boolean tryagainaccnt(boolean flag) {
		System.out.println("press 0 to try again");
		System.out.println("press 9 to go back to number ");
		int chance = scanner.nextInt();
		if (chance == 0) {
			System.out.println(" please enter your 8 digit  account number");
			String accountNo = scanner.next();
			if (accountNo.matches("\\d{8}")) {
				System.out.println("Thank you for account number");
				return flag = operationaccnt(flag);
			} else {
				System.out.println("your Account Number is invalid. going back to previous menu");
				return flag = true;
			}
		} else if (chance == 9) {
			return flag = true;
		}
		return flag;
	}
	
	private static boolean current(boolean flag) {
		System.out.println("-----------------------------------------------------");
		System.out.println(" please enter your current account number");
		String accountNo = scanner.next();
		if (accountNo.matches("\\d{8}")) {
			System.out.println("Thank you for current account number");
			return flag = operationaccnt(flag);
		} else {
			return flag = tryagainaccnt(flag);
		}
	}

	private static boolean cards(boolean flag) 
	{System.out.println("-----------------------------------------------------");
		System.out.println("press 1 for credit card ");
		System.out.println("press 2 for debit card ");
		int opt = scanner.nextInt();
		switch (opt) {
		case 1: {
			System.out.println(" please enter your credit card number");
			String crdtNo = scanner.next();

			if (crdtNo.matches("\\d{16}")) {
				System.out.println("Thank you for credit account number");
				 flag = operationcard(flag);
			} else {
				return flag = tryagaincard(flag);
			}			
		}
			break;
		case 2: {
			System.out.println(" please enter your debit card number");
			String crdtNo = scanner.next();
			if (crdtNo.matches("\\d{16}")) {
				System.out.println("Thank you for debit card number");
				flag = operationcard(flag);
			}else {
			 return flag = tryagaincard(flag);	}		
		}
			break;
		}
		return flag;	
	}

	private static boolean operationcard(boolean flag) {
		System.out.println("press 1 to block your card");
		System.out.println("press 2 to speak customer care");
		System.out.println("press 9 to go back to MainMenu");
		int sv = scanner.nextInt();
		if (sv == 1) {
			System.out.println("The card is blocked.");
			flag = false;
		} else if (sv == 2) {
			System.out.println("This is connecting to customer care......");
			flag = false;
		} else if (sv == 9) {
			flag = true;
		}
		System.out.println("-----------------------------------------------------");
		return flag;
	}

	private static boolean tryagaincard(boolean flag) {
		System.out.println("press 0 to try again 16 digit card");
		System.out.println("press 9 to go back to MainMenu ");
		int choice = scanner.nextInt();
		if (choice == 0) {
			System.out.println(" please enter your 16 digit  card number");
			String crdtNo = scanner.next();
			if (crdtNo.matches("\\d{16}")) {
				System.out.println("Thank you for card number");
				return flag = operationcard(flag);
			} else {
				System.out.println("The number is invalid");
				return flag = true;
			}
		} else if (choice == 9) {
			return flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		
		boolean flag = true;
		while (flag) {
			System.out.println("_____________________________________________________");
			System.out.println("                       welcome                       ");
			System.out.println("-----------------------------------------------------");
			System.out.println("press 0 to exit");
			System.out.println("press 1 for loans");
			System.out.println("press 2 for Savings account");
			System.out.println("press 3 for Current account");
			System.out.println("press 4 for cards");
			System.out.println("enter the choice");
			int n = scanner.nextInt();
			switch (n) {
			case 0:
				System.exit(0);
				break;
			case 1:
				flag = loans(true);
				break;
			case 2:
				flag = saving(true);
				break;				
			case 3:
				flag = current(true);
				break;				
			case 4:
				flag = cards(true);
				break;
			default:
				System.out.println("Invalid...");
			}
		}
	}
}
