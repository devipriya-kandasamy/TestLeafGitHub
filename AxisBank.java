package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("Hello Axis Bank ");
	
	}
	
	public static void main(String[] args) {
		AxisBank axb = new AxisBank();
		axb.deposit();
		BankInfo.fixed();
		axb.saving();
		//axb.fixed();

	}

}
