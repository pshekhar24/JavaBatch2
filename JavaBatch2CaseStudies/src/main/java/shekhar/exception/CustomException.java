package shekhar.exception;

public class CustomException extends Exception {
	
	 public CustomException(String message) {
		 super(message);
		 System.out.println(message);
	 }

}
