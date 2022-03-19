package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum = 0;
		int range = 8;
		int secNum = 1;
		int sum;
		System.out.println(firstNum);
		System.out.println(secNum);

		for (int i = 1; i < range-1; i++) {
			sum = firstNum + secNum;
			System.out.println(sum);

			firstNum = secNum;
			secNum = sum;

		}
	}

}
