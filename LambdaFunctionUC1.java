package functionalInterface;

public class LambdaFunctionUC1 {
	@FunctionalInterface
	interface IMathOperation {
		int calculate(int x, int y);
	}

	IMathOperation add = Integer::sum;
	IMathOperation substract = (x, y) -> x - y;
	IMathOperation multiply = (x, y) -> x * y;
	IMathOperation divide = Integer::divideUnsigned;

	public static void main(String[] args) {
		LambdaFunctionUC1 lf = new LambdaFunctionUC1();
		System.out.println("Addition is: " + lf.add.calculate(50, 10));
		System.out.println("Substraction is:" + lf.substract.calculate(50, 10));
		System.out.println("Multiplication is:" + lf.multiply.calculate(50, 10));
		System.out.println("Division is: " + lf.divide.calculate(50, 10));
	}

}
