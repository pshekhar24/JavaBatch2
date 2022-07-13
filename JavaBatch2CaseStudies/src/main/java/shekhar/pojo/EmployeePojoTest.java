package shekhar.pojo;

public class EmployeePojoTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmployeeId("10");
		employee.setEmployeeAge(20);
		employee.setEmployeeName("Shekhar");
		
		EmployeeAadhar employeeAadhar = new EmployeeAadhar();
		employeeAadhar.setAadharNo(2398479);
		employeeAadhar.setAadharName("Shekhar patil");
		employeeAadhar.setAadharAddress("Kpo Bangalore");
		
		employee.setEmployeeAadhar(employeeAadhar);
		
		System.out.println(employee);
	}

}
