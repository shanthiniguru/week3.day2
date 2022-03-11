package week3.day2;

public class MyBank {
	public static void main(String[] args) {
		//Create object for SBI
		SBI obj1 = new SBI();		
		obj1.openAccount();
		obj1.provideDebitCard(123456789);
		obj1.provideCreditCard();
		
		
		//Create object for RBI
		RBI obj2 = new SBI();
		obj2.openAccount();
		obj2.provideDebitCard(123456789);
	}


	
}
