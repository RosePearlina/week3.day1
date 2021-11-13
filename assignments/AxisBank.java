package week3.day1.assignments;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("The Axis bank deposit");
	}

	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit();
		ab.fixed();
		ab.saving();
		
	}

}
