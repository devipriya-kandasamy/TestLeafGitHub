package week1.day1.assignments;

public class PrimeNumbers {

	public static void main(String[] args) {
		int a = 13;
		int b = a / 2;
		boolean isPrime = true;

		for (int i = 2; i <= b; i++) {
			int c = a % i;
			if (c == 0) {
				isPrime = false;
				break;
			}
			;
		}
		if (isPrime) {
			System.out.println(a + " is Prime Number");
		} else {
			System.out.println(a + " is Not a Prime Number");
		}
	}

}
