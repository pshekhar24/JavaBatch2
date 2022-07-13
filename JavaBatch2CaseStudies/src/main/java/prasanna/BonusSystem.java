package prasanna;

import java.util.Scanner;

class Dept {																						//parent class 
	Scanner sc = new Scanner(System.in);
	double basicSalary;
	double salary;
	String Deptname;

	double basicsal(String Deptname) {															//asking basic sal of there dept				
		System.out.println("Basic salary for the " + Deptname + ":");
		basicSalary = sc.nextDouble();
		return basicSalary;
	}

	double incentive() {															//asking the how much Amt incentive 
		System.out.println("Enter how much incentive Amt to add :");
		double in = sc.nextDouble();
		System.out.println("Incentive of " + in + "  is being added:");
		return in;
	}

	double travelAll() {														 //asking the amt for traveling allowncse
		System.out.println("Enter the traveling allowance");
		int travelAmt = sc.nextInt();
		System.out.println("Travling allownce is being added:");
		return travelAmt;
	}

	double bonus() {															 //bonus method to ask how much 
		System.out.println("Enter Bonus Amount");
		int bonus = sc.nextInt();
		System.out.println("Bouns is being added:");
		return bonus;
	}

	double hra() {
		System.out.println("Enter Hra Amount");									//bonus method to ask how much
		int hra = sc.nextInt();
		System.out.println("Hra amt is being adde:");
		return hra;
	}

	void totalSal(double salary) {												// printing salary 
		System.out.println(" Total Salary: " + salary);
	}

	void salary(){
	}
}

															             	//extending to department
class SalesDepartment extends Dept {
	String Deptname = "SalesDept";
	@Override
	void salary() {
		basicsal(Deptname);
		salary = basicSalary + incentive();				       			// adding incentive extra percent of salary
		totalSal(salary);
	}
}

class Operations_Dept extends Dept {							             //extending to department
	String Deptname = "OperationDept";
	@Override
	void salary() {
		basicsal(Deptname);
		salary = basicSalary + hra();										//adding the HRA amt to salary
		totalSal(salary);
	}
}

class HRDept extends Dept {										           //extending to department

	String Deptname = "HrDept";
	@Override
	void salary() {
		basicsal(Deptname);
		salary = basicSalary + bonus(); 								 //adding the bonus to Hr_Dept
		totalSal(salary);
	}
}

class Marketing extends Dept {										    	//extending to department
	String Deptname = "MarketDept";
	@Override
	void salary() {
		basicsal(Deptname);
		salary = basicSalary + incentive() + travelAll();				//adding the incetive + travl allowncse to salary
		totalSal(salary);
	}
}

public class BonusSystem {

	public static void main(String[] args) {
		Dept d;   																	//using parent class 

		System.out.println("------------------------");
		new SalesDepartment().salary();												// saledept object.method()
		System.out.println("------------------------");
		d = new Operations_Dept();													//using parent class type reference 					
		d.salary();																			
		System.out.println("------------------------");
		d = new HRDept();															//using parent class type reference 
		d.salary();
		System.out.println("------------------------");
		d = new Marketing();														//using parent class type reference 			
		d.salary();

	}

}
