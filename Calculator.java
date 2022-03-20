package week1.day2;

public class Calculator {

	public int add(int a, int b) {
		return a+b;
	}
	
	public double subtraction(double c, double d) {
		return c-d;
	}
	
	public double multiplication(double c, double d) {
			return c*d;
	}
	
	public int division(int a, int b) {
			return a / b;
	}
	
	
	public static void main(String[] args) {
		int a = 500, b= 300;
		double c = 456.45, d = 123.12;
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(a, b));
		System.out.println(calc.subtraction(c, d));
		System.out.println(calc.multiplication(c, d));
		System.out.println(calc.division(a, b));

		
	}

}
/*
 * Create a class called Calculator with below methods: - add() with 2 int
 * arguments and return sum - 
 * sub() with 2 double arguments and return sub -
 * multiply() with 2 double arguments and return mul - 
 * divide() with 2 int
 * arguments and return div
 */