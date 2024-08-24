package SimpleBankSystem;

public class Balance {
	private double balance;
	
	public void balanceCheck(double balance) {
		this.balance = balance;
	}
	public void checkBalance() {
		System.out.println("Your balance is: " + balance);
	}
	
	public void withdrawUser(double withdrawAmount) {
		if (withdrawAmount < balance) {
			this.balance -= withdrawAmount;
			System.out.println(withdrawAmount + " has been withdrawn. New balance is: " + balance);
		}
		else {
			System.out.println("Insufficient funds. Cannot withdraw " + withdrawAmount);
		}
	}
	
	public void depositUser(double depositAmount) {
		this.balance += depositAmount;
		System.out.println(depositAmount + " has been deposited. New balance is: " + balance);
	}
}
