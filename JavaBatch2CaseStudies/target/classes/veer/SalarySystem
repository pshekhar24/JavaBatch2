import java.util.Scanner;

class Departments {
	double salary = 0.0;
	double incentive = 0.0;
	double bonus = 0.0;
	double hraAllowance = 0.0;
	double travelAllowance = 0.0;

	static double salesDepartment(double salary, double incentive) {
		return salary + incentive;

	}

	static double hrDepartment(double salary, double bonus) {
		return salary + bonus;

	}

	static double marketingDepartment(double salary, double incentive, double travelAllowance) {
		return salary + incentive + travelAllowance;

	}

	static double operationDepartment(double salary, double hraAllowance) {
		return salary + hraAllowance;

	}

}

public class SalarySystem extends Departments {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Department name: ");
		String DepartmentName = sc.nextLine();

		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();

		if (DepartmentName.equalsIgnoreCase("salesDepartment")) {
			System.out.println("Enter incentive: ");
			double incentive = sc.nextDouble();
			System.out.println(salesDepartment(salary, incentive));

		} else if (DepartmentName.equalsIgnoreCase("hrDepartment")) {
			System.out.println("Enter Bonus: ");
			double bonus = sc.nextDouble();
			System.out.println(hrDepartment(salary, bonus));

		} else if (DepartmentName.equalsIgnoreCase("marketingDepartment")) {
			System.out.println("Enter incentive: ");
			double incentive = sc.nextDouble();
			System.out.println("Enter TravelAllowance: ");
			double travelAllowance = sc.nextDouble();
			System.out.println(marketingDepartment(salary, incentive, travelAllowance));

		} else if (DepartmentName.equalsIgnoreCase("operationDepartment")) {
			System.out.println("Enter incentive: ");
			double hraAllowance = sc.nextDouble();
			System.out.println(operationDepartment(salary, hraAllowance));

		} else {
			System.out.println("Invalid department...");
		}

	}

}
