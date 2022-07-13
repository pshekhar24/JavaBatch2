package shekhar.salary.bonus.system;

import java.util.Scanner;

public class MarketingDepartmentSalaryCalculation implements SalaryCalculationBase {

	@Override
	public void calculateSalary(Scanner scanner) {
		System.out.println("Marketing Department will get Base Salalary, Travel Allowance and Insentives");
		System.out.println("Please enter the base salary for an employee");
		int baseSalary = scanner.nextInt();
		System.out.println("Please enter the Travel Allowance for an employee");
		int travelAllowance = scanner.nextInt();
		System.out.println("Please enter the Incentives for an employee");
		int incentives = scanner.nextInt();
		System.out.println("Total Salary = " + (baseSalary + travelAllowance + incentives));
		scanner.close();
	}

}
