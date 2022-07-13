package kunal;

import java.util.Scanner;

class Calculation {

	protected double incentive(double basicSalary) { 					// Incentive
		return (basicSalary * 10 / 100);
	}

	protected double bonus(double basicSalary) { 						// Bonus
		if (basicSalary < 5000) {
			return (basicSalary * 8) / 1000;
		} else {
			return (5000 * 8) / 1000;
		}
	}

	protected double hraAllowance(double basicSalary) { 				// HRA Allowance
		return 5 / 100.0 * basicSalary;
	}

	protected double travelAllowance(double basicSalary) { 				// Travel Allowance
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter travel allowance:");
			return scanner.nextDouble();
		}
	}

}

public class SalarySystem extends Calculation {

	public static void main(String args[]) {
		
		SalarySystem salarysystem = new SalarySystem();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter basic salary:");
		double basicSalary = scanner.nextDouble();
		
		double salary = basicSalary;
		double incentive;
		double bonus;
		double hraAllowance;
		double travelAllowance;

		while (true) {
			System.out.println("Enter 1 for HR department: ");
			System.out.println("Enter 2 for Sales department: ");
			System.out.println("Enter 3 for Marketing department: ");
			System.out.println("Enter 4 for Operation department: ");
			int department = scanner.nextInt();

			if (department == 1) {										// HR
				bonus = salarysystem.bonus(basicSalary);
				salary = basicSalary + bonus;
				break;
			} else if (department == 2) { 								// Sales
				incentive = salarysystem.incentive(basicSalary);
				salary = basicSalary + incentive;
				break;
			} else if (department == 3) {								// Marketing
				incentive = salarysystem.incentive(basicSalary);
				travelAllowance = salarysystem.travelAllowance(basicSalary);
				salary = basicSalary + incentive + travelAllowance;
				break;
			} else if (department == 4) { 								// Operation
				hraAllowance = salarysystem.hraAllowance(basicSalary);
				salary = basicSalary + hraAllowance;
				break;
			} else {
				System.out.println("Invalid");
			}
		}
		
		System.out.println("The salary is: " + salary);
		scanner.close();
	}
}
