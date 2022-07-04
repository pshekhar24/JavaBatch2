package arun;

public class Departments {

	double salary;
	double bonus;
	double incentive;
	double hraAllowance;
	double travelAllowance;
	double totalSalary;

	public void displayTotalSalary(String dept) {
		System.out.println(dept + "\t\t" + salary + "\t\t" + incentive + "\t\t" + hraAllowance + "\t\t"
				+ travelAllowance + "\t\t" + bonus + " \t\t" + totalSalary);
	}
}

class Sales extends Departments {
	public void calIncentive(double sal) {
		salary = sal;
		incentive = sal * 0.2;
		totalSalary = salary + incentive;
	}
}

class HR_Dept extends Departments {
	public void calBonus(double sal) {
		salary = sal;
		bonus = sal * 0.2;
		totalSalary = salary + bonus;
	}
}

class Operation extends Departments {
	public void cal_Hra_allowance(double sal) {
		salary = sal;
		hraAllowance = 6400;
		totalSalary = salary + hraAllowance;
	}
}

class Marketing extends Departments {
	public void cal_Travel_allowance(double sal) {
		salary = sal;
		incentive = sal * 0.2;
		travelAllowance = 1200;
		totalSalary = salary + incentive + travelAllowance + bonus;
	}
}