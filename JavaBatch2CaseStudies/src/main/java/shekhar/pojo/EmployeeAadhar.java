package shekhar.pojo;

public class EmployeeAadhar {

	private int aadharNo;
	private String aadharName;
	private String aadharAddress;
	
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAadharName() {
		return aadharName;
	}
	public void setAadharName(String aadharName) {
		this.aadharName = aadharName;
	}
	public String getAadharAddress() {
		return aadharAddress;
	}
	public void setAadharAddress(String aadharAddress) {
		this.aadharAddress = aadharAddress;
	}
	
	@Override
	public String toString() {
		return "EmployeeAadhar [aadharNo=" + aadharNo + ", aadharName=" + aadharName + ", aadharAddress="
				+ aadharAddress + "]";
	}
	
	
}
