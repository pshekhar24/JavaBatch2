package testExam;

import java.util.Scanner;

class Department { // Department class
	Scanner scanner = new Scanner(System.in);
	double basicSalary;
	double salary;

	double basicSalary() { // for Basic Salary
		System.out.println("Enter Basic Salary: ");
		basicSalary = scanner.nextDouble();
		return basicSalary;
	}

	double incentive() { // for Incentive
		System.out.println("Enter Incentive: ");
		double incentiveAmount = scanner.nextDouble();
		return incentiveAmount;
	}

	double travelAllowance() { // For Traveling Allowance
		System.out.println("Enter the Traveling Allowance: ");
		int travelAmount = scanner.nextInt();
		return travelAmount;
	}

	double bonus() { // For Bonus
		System.out.println("Enter Bonus Amount: ");
		int bonusAmount = scanner.nextInt();
		return bonusAmount;
	}

	double hra() {
		System.out.println("Enter Hra Amount: "); // For HRA Amount
		int hraAmount = scanner.nextInt();
		return hraAmount;
	}

	void totalSalary(double salary) { // For print Salary
		System.out.println("Total Salary: " + salary);
	}

}

public class SalaryAndBonusSystem {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 for Sales Department");
			System.out.println("Press 2 for HR Department");
			System.out.println("Press 3 for Operations Department");
			System.out.println("Press 4 for Marketing Department");
			System.out.println("Press 0 for Exit");
			int choice = scanner.nextInt();
			Department dept = new Department();
			switch (choice) {
			case 1:
				System.out.println("You Entered for Sales Department");
				dept.basicSalary();
				dept.salary = dept.basicSalary + dept.incentive();
				dept.totalSalary(dept.salary);
				break;
			case 2:
				System.out.println("You Entered for HR Department");
				dept.basicSalary();
				dept.salary = dept.basicSalary + dept.bonus();
				dept.totalSalary(dept.salary);
				break;
			case 3:
				System.out.println("You Entered for Operations Department");
				dept.basicSalary();
				dept.salary = dept.basicSalary + dept.hra();
				dept.totalSalary(dept.salary);
				break;
			case 4:
				System.out.println("You Entered for Marketing Department");
				dept.basicSalary();
				dept.salary = dept.basicSalary + dept.incentive() + dept.travelAllowance();
				dept.totalSalary(dept.salary);
				break;
			case 0:
				System.out.println("Exit | Thank You");
				System.exit(choice);
			default:
				System.out.println("Please Choose Correct Option:");
				break;
			}
		}
	}
}
