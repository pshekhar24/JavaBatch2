package shekhar.oops.encapsulation;

public class SystemLogin {

	public void login(String userName, String password) {
		//1 decryptPassword
		decryptpassword(password);
		//2 connectToDb
		getDbConnection();
		//3 fire query and verify
		checkLoginInfoInDb(userName, password);
		//4 is show login result
		verifyLogin();
	}

	private void verifyLogin() {
		System.out.println("verifying Login");
	}

	private void checkLoginInfoInDb(String userName, String password) {
		System.out.println("verifying login details...");
	}

	private void getDbConnection() {
		System.out.println("getting database connection....");
	}

	private void decryptpassword(String password) {
		System.out.println("Decrypting password....");
	}
	
}
