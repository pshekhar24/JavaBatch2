package shekhar.salary.bonus.system;

import java.util.Scanner;

public class OperationsDepartmentSalaryCalculation implements SalaryCalculationBase {

	@Override
	public void calculateSalary(Scanner scanner) {
		System.out.println("Operations Department will get Base Salalary and HRA");
		System.out.println("Please enter the base salary for an employee");
		int baseSalary = scanner.nextInt();
		System.out.println("Please enter the HRA for an employee");
		int hra = scanner.nextInt();
		System.out.println("Total Salary = " + (baseSalary + hra));
		scanner.close();
	}

}
