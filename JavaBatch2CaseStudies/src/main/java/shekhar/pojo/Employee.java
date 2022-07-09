package shekhar.pojo;

import java.util.List;

public class Employee {
	//states
	private String employeeId;
	private String employeeName;
	private int employeeAge;
	private EmployeeAadhar employeeAadhar; // one to one
	private List<Skills> skills; // one to many
	
	public Employee() {
		
	}
	 
	
	public Employee(String employeeId) {
		//make db calls
		// fetch employee details from db
		this.employeeId = employeeId;
		this.employeeAge = 50; // 50 returned from db
		this.employeeName = "shekhar"; //teturned from db
	}
	
	//behaviours
	public String getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}


	public void setEmployeeName(String employeeName) {
		//update in database
		this.employeeName = employeeName;
	}

	public EmployeeAadhar getEmployeeAadhar() {
		return employeeAadhar;
	}

	public void setEmployeeAadhar(EmployeeAadhar employeeAadhar) {
		this.employeeAadhar = employeeAadhar;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", employeeAadhar=" + employeeAadhar + "]";
	}

	
}
