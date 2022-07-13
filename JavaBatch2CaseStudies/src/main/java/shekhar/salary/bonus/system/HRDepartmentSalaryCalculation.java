package shekhar.salary.bonus.system;

import java.util.Scanner;

public class HRDepartmentSalaryCalculation implements SalaryCalculationBase {

	@Override
	public void calculateSalary(Scanner scanner) {
		System.out.println("HR Department will get Base Salalary and Bonus");
		System.out.println("Please enter the base salary for an employee");
		int baseSalary = scanner.nextInt();
		System.out.println("Please enter the Bonus for an employee");
		int bonus = scanner.nextInt();
		System.out.println("Total Salary = " + (baseSalary + bonus));
		scanner.close();
		System.gc();
	}

	
	@Override
	public void finalize() {
		System.out.println("GC done");
	}
	

}
