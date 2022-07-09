package shekhar.oops.encapsulation;

public class CandyWrapper {

	public String candyType;
	
	private String candyColor;
	
	private String candyName;
	
	public void wrapCandy(String candyType, String candyColor, String candyName) {
		this.candyColor = candyColor;
		this.candyType = candyType;
		this.candyName = candyName;
		System.out.println("Candy wrapped for " + candyName);
	}
	
}
