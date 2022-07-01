package prasanna;

import java.util.Scanner;

interface CalBasic {
	void addition();

	void substraction();

	void division();

	void multiplication();

}

interface CalAdvance {

	void percentage();

	void Modulus();

}

//abstract class CalFun implements CalBasic, CalAdvance {
//	public abstract void addition();
//
//	public abstract void substraction();
//
//	public abstract void division();
//
//	public abstract void multiplication();
//
//	public abstract void Modulus();
//
//	public abstract void percentage();
//}

class calculator implements CalBasic, CalAdvance
// extends CalFun
{
	private double firstNum;
	private double secondNumber;
	double result;
	String fun; 

	public calculator(double firstNum, double secondNumber) {
		this.firstNum = firstNum;
		this.secondNumber = secondNumber;
	}

	public void percentage() {
		result = firstNum / secondNumber * 100;
		System.out.println("---------------------------------------");
		System.out.println("Percentage ="+ result+"%");

	}

	public void Modulus() {
		fun="%";
		result = firstNum % secondNumber;
		resultPrint(result,firstNum,secondNumber,fun);
	}

	public void addition() {
		fun="+";
		result = firstNum + secondNumber;
		resultPrint(result,firstNum,secondNumber,fun);
	}

	public void substraction() {
		fun="-";
		result = firstNum - secondNumber;
		resultPrint(result,firstNum,secondNumber,fun);
	}

	public void division() {
	
		result = firstNum / secondNumber;
		System.out.println("---------------------------------------");
		System.out.println("Result of "+firstNum+" / "+secondNumber+" ="+ result);
	}

	public void multiplication() {
		fun="*";
		result = firstNum * secondNumber;
		resultPrint(result,firstNum,secondNumber,fun);
	}

	void resultPrint(double result,double firstNumber,double secondNumber, String fun ) {

		System.out.println("---------------------------------------");
		System.out.println("Result of "+firstNumber+" "+fun+" "+secondNumber+"=" + (int) result);

	}

}

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double firstNumber;
		double secondNumber;
		boolean flag = true;

		while (flag) {
			
			System.out.println("Enter The First number ");
			firstNumber = sc.nextDouble();
			System.out.println("Enter The Second number");
			secondNumber = sc.nextDouble();
			int repeatOperation=1;
			
			while(repeatOperation==1){
			repeatOperation=0;
			System.out.println("Select the the operation:\n(enter what is inside the bracket)* ");
			System.out.println("For addition 1 or (+)");
			System.out.println("For subtraction 2 or (-)");
			System.out.println("For divison 3 or (/)");
			System.out.println("For modulus  4 or (Mod)");
			System.out.println("For percentage  5 or percentage(%)");
			System.out.println("For Multiplication 6 or (*)");
			sc.nextLine();
			String choice = sc.next();
			
				
			calculator calculate = new calculator(firstNumber, secondNumber);

			if (choice.equals("+") || choice.equals("1")) {
				calculate.addition();
				
			} else if (choice.equals("-") || choice.equals("2")) {
				calculate.substraction();
				
			} else if (choice.equals("/") || choice.equals("3")) {
				calculate.division();
				
			} else if (choice.equals("Mod") || choice.equals("4")) {
				calculate.Modulus();
			
			} else if (choice.equals("%") || choice.equals("5")) {
				calculate.percentage();
				
			} else if (choice.equals("*") || choice.equals("6")) {
				calculate.multiplication();
				
			} else {
				System.out.println("invalid operation.... try again...");
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("want to change the operation press 1:");
				int option=sc.nextInt();
				if(option==1){
					repeatOperation=1;
				}else	{	
					
					break;
					}
				flag = true;
			}
			
				
			}
			flag=false;

		}
		sc.close();
	}

}
