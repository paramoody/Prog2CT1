
public class CheckingAccount extends BankAccount {
	public double interestRate;
	CheckingAccount(double balance, double interestRate, String firstName, String lastName, int accountId) {
		super(firstName, lastName, accountId);
		setBalance(balance);
		this.interestRate = interestRate;
		
	}
	
	public void processWithdrawal(double withdrawalAmount) {
		super.withdrawal(withdrawalAmount);
		if (getBalance() < 0){
			setBalance(getBalance() - 30);
			System.out.println("Your account has been charged an overdraft fee of $30. "
					+ "Your new balance is " + getBalance());
		}
	}
	public void displayAccount() {
		super.accountSummary();
		System.out.println("Interest Rate: " + this.interestRate);
	}

}
