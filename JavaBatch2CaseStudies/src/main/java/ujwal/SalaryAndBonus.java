package ujwal;

import java.util.Scanner;

class Dept { 
	Scanner sc = new Scanner(System.in);
	double basicSalary;
	double salary;

	double basicSalary() {
		System.out.println("Provide Basic Salary for this dept: ");
		basicSalary = sc.nextDouble();
		return basicSalary;
	}

	double incentive() { 
		System.out.println("Provide Incentive for this dept: ");
		double incentiveAmount = sc.nextDouble();
		return incentiveAmount;
	}

	double travelAllowance() { 
		System.out.println("Provide Travelling Allowance for this dept: ");
		int travelAmount = sc.nextInt();
		return travelAmount;
	}

	double bonus() { 
		System.out.println("Provide Bonus for this dept: ");
		int bonusAmount = sc.nextInt();
		return bonusAmount;
	}

	double hra() {
		System.out.println("Provide HRA for this dept: "); 
		int hraAmount = sc.nextInt();
		return hraAmount;
	}

	void totalSalary(double salary) { 
		System.out.println("Total Salary for this dept: " + salary);
	}

}

public class SalaryAndBonus extends Dept{

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 for Sales Department");
			System.out.println("Press 2 for HR Department");
			System.out.println("Press 3 for Operations Department");
			System.out.println("Press 4 for Marketing Department");
			System.out.println("-----------------------------------");
			
			int n = sc.nextInt();
			Dept dept = new Dept();
			switch (n) {
			case 1:
				System.out.println("Welcome to Sales Department");
				dept.basicSalary();
				dept.salary = dept.basicSalary + dept.incentive();
				dept.totalSalary(dept.salary);
				break;
			case 2:
				System.out.println("Welcome to HR Department");
				dept.basicSalary();
				dept.salary = dept.basicSalary + dept.bonus();
				dept.totalSalary(dept.salary);
				break;
			case 3:
				System.out.println("Welcome to Operations Department");
				dept.basicSalary();
				dept.salary = dept.basicSalary + dept.hra();
				dept.totalSalary(dept.salary);
				break;
			case 4:
				System.out.println("Welcome to Marketing Department");
				dept.basicSalary();
				dept.salary = dept.basicSalary + dept.incentive() + dept.travelAllowance();
				dept.totalSalary(dept.salary);
				break;
			default:
				System.out.println("Please Choose Correct Option:");
				break;
			}
		}
	}
}