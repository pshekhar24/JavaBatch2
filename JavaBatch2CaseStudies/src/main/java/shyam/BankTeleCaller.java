
import java.util.Scanner;

class Bank {

	void loanSection() {

		System.out.println("press 1 for personal loan:");
		System.out.println("press 2 for housing loan:");
		System.out.println("press 3 for car loan:");
		System.out.println("press 4 for gold loan:");
		System.out.println("press 9 to go back to previous menu:");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		switch (input) {
		case 1:
			System.out.println("personal loan");
			loanSection();
			break;

		case 2:
			System.out.println("housing loan");
			loanSection();
			break;

		case 3:
			System.out.println("car loan");
			loanSection();
			break;

		case 4:
			System.out.println("gold loan");
			loanSection();
			break;

		case 9:
			System.out.println("back to main menu:");
			BankTeleCaller.main(null);
		default:
			System.out.println("plz press valid key:");
			loanSection();
		}

	}

	void savingsAccount() {
		Scanner scanner = new Scanner(System.in);

		long accountno = scanner.nextLong();
		String b = String.valueOf(accountno);
		int leng = b.length();
		if (leng <= 8) {
			System.out.println("Thank you for account number");

			System.out.println("press 1 to show account balance");
			System.out.println("press 2 to speak customer care");
			System.out.println("press 9 to go back to previous menu");

			int input = scanner.nextInt();
			switch (input) {
			case 1:
				System.out.println("show account balance");
				System.out.println("press 9 to go back to previous menu");
				savingsAccount();
				break;

			case 2:
				System.out.println("speak customer care");
				System.out.println("press 9 to go back to previous menu");
				savingsAccount();
				break;

			case 9:
				System.out.println(" go back to main menu");
				BankTeleCaller.main(null);
				break;

			default:
				System.out.println("plz press valid key:");
				savingsAccount();
			}

		}

		else {

			System.out.println("enter valid account no");
			savingsAccount();

		}

	}

	void currentAccount() { // Current Account Section

		Scanner B = new Scanner(System.in);

		long accountno = B.nextLong();
		String b = String.valueOf(accountno);
		int leng = b.length();
		if (leng <= 8) {
			System.out.println("Thank you for account number");

			System.out.println("press 1 to show account balance");
			System.out.println("press 2 to speak customer care");
			System.out.println("press 9 to go back to previous menu");

			int A = B.nextInt();

			switch (A) {
			case 1:
				System.out.println("show account balance");
				System.out.println("press 9 to go back to previous menu");
				currentAccount();
				break;

			case 2:
				System.out.println("speak customer care");
				System.out.println("press 9 to go back to previous menu");
				currentAccount();
				break;

			case 9:
				System.out.println(" go back to main menu");
				BankTeleCaller.main(null);
				break;

			default:
				System.out.println("plz press valid key:");
				currentAccount();
			}

		}
	}

	void cardsSection() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("press 1 for credit card");
		System.out.println("press 2 for debit card");
		System.out.println("press 9 to go back to previous menu");

		int s = scanner.nextInt();
		if (s == 1) {
			System.out.println("enter your credit card number:");
			long accountno = scanner.nextLong();
			String b = String.valueOf(accountno);
			int leng = b.length();
			if (leng >= 8 && leng <= 16) {
				System.out.println("Thank you for account number");
				// Credit card
				System.out.println("press 1 to block your card");

				System.out.println("press 2 to speak customer care");

				System.out.println("press 9 to go back to previous menu");

				int c = scanner.nextInt();
				if (c == 1) {
					System.out.println("block your card");
					System.out.println("press 9 to go back to previous menu");
					cardsSection();
				} else if (c == 2) {
					System.out.println("speak customer care");

					cardsSection();

				} else {
					System.out.println("plz enter 9 previes mainu");
					BankTeleCaller.main(null);
				}

			} else {
				System.out.println("invalid no try again:");
				cardsSection();

			}

		}
//  debit card section
		else if (s == 2) {
			System.out.println("please enter your debit card number number:");
			long accountno = scanner.nextLong();
			String b = String.valueOf(accountno);
			int leng = b.length();
			if (leng >= 8 && leng <= 16) {
				System.out.println("Thank you for account number");

				System.out.println("press 1 to block your card");

				System.out.println("press 2 to speak customer care");

				System.out.println("press 9 to go back to previous menu");

				int c = scanner.nextInt();
				if (c == 1) {
					System.out.println("block your card");
					cardsSection();

				} else if (c == 2) {
					System.out.println("speak customer care");
					cardsSection();
				} else {
					System.out.println("plz enter 9 previes mainu");
					cardsSection();
				}

			} else {
				System.out.println("press 9 to go to previous menu");
				BankTeleCaller.main(null);
			}

		}
	}
}

public class BankTeleCaller {

	public static void main(String[] args) {

		System.out.println("press 0 for exit:");
		System.out.println("press 1 for loan:");
		System.out.println("press 2 for saving account:");
		System.out.println("press 3 for current account:");
		System.out.println("press 4 for card :");

		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		Bank sb = new Bank();
		// while(n!=0){
		switch (input) {
		case 0:
			System.out.println("exit");
			break;

		case 1:
			System.out.println("loans Section");
			sb.loanSection();

			break;

		case 2:
			System.out.println(" enter your Saving account:");
			sb.savingsAccount();
			break;

		case 3:
			System.out.println("enter Current account number");
			sb.currentAccount();
			break;

		case 4:
			sb.cardsSection();
			break;

		default:
			System.out.println("plz press valid key:");
		}
	}



}
