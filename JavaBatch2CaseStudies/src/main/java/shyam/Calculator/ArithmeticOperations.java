package Calculator;

class ArithmeticOperations implements Calculation {

	@Override
	public int addition(int input1, int input2) {
		System.out.println("Addition of two Numbers:");
		int result = input1 + input2;
		return result;

	}

	@Override
	public int substraction(int input1, int input2) {
		System.out.println("substraction of two Numbers:");
		int result = input1 - input2;
		return result;
	}

	@Override
	public int multiplication(int input1, int input2) {
		System.out.println("multiplication of two Numbers:");
		int result = input1 * input2;
		return result;
	}

	@Override
	public double dividetion(int input1, int input2) {
		System.out.println("dividetion of two Numbers:");
		double result = (input1 / input2);
		return (double) result;
	}

	@Override
	public int modulation(int input1, int input2) {
		System.out.println("Modulation of :");
		int result = input1 % input2;
		return result;
	}

}