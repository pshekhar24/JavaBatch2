package arun;

public class Calculator {

	private double firstNumber, secondNumber;

	public Calculator(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public double addition() {
		return firstNumber + secondNumber;
	}

	public double subtraction() {
		return firstNumber - secondNumber;
	}

	public double multiplication() {
		return firstNumber * secondNumber;
	}

	public double division() {
		return firstNumber / secondNumber;
	}

	public double modulus() {
		return firstNumber % secondNumber;
	}

	public double PercentageOperation() {
		return firstNumber * 100 / secondNumber;
	}
}
