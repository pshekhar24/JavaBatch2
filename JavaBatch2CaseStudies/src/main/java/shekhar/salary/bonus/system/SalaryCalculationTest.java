package shekhar.salary.bonus.system;

import java.util.Scanner;

public class SalaryCalculationTest {

	public static void main(String[] args) {
		SalaryCalculationBase salaryCalculationBase = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 for Sales Department slary Calculation");
		System.out.println("Press 2 for HR Department slary Calculation");
		System.out.println("Press 3 for Operations Department slary Calculation");
		System.out.println("Press 4 for Marketing Department slary Calculation");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			salaryCalculationBase = new SalesDeapartmentSalaryCalculation();
			break;
		case 2:
			salaryCalculationBase = new HRDepartmentSalaryCalculation();
			break;
		case 3:
			salaryCalculationBase = new OperationsDepartmentSalaryCalculation();
			break;
		case 4:
			salaryCalculationBase = new MarketingDepartmentSalaryCalculation();
			break;
		default:
			System.out.println("Invalid input!");
			break;
		}
		if (salaryCalculationBase != null) {
			salaryCalculationBase.calculateSalary(scanner);
		}
	}

}
