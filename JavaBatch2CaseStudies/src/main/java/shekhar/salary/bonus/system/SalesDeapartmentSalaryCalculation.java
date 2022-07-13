package shekhar.salary.bonus.system;

import java.util.Scanner;

import shekhar.exception.CustomException;

public class SalesDeapartmentSalaryCalculation implements SalaryCalculationBase {

	@Override
	public void calculateSalary(Scanner scanner) {
		System.out.println("Salaes Department will get Base Salalary and Insentives");
		System.out.println("Please enter the base salary for an employee");
		double baseSalary = scanner.nextInt();
		System.out.println("Please enter the Incentives for an employee in percentage");
		double incentives = scanner.nextInt();
		try {
			validateInput(incentives);
			double totalIncentives = (baseSalary * (incentives/100));
			System.out.println(totalIncentives);
			System.out.println("Total Salary = " + (baseSalary + totalIncentives));
		} catch (CustomException e) {
			System.out.println("Invalid Input");
		} finally { 
			scanner.close();
		}
	}

	private void validateInput(double incentives) throws CustomException {
		if (incentives > 100) {
			throw new CustomException("Incentive cannot be greater than 100%");
		}
		
	}

}
