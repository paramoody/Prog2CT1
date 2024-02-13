
public class BankAccount {
	private String firstName, lastName;
	private int accountId; 
	private double balance;
	
	BankAccount(String firstName, String lastName, int accountId){
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountId = accountId;
		this.balance = 0;
	}
	public void deposit(double depositAmount){
		this.balance += depositAmount;
	}
	
	public void withdrawal(double withdrawalAmount) {
		this.balance -= withdrawalAmount;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAccountID() {
		return accountId;
	}
	public void setAccountID(int accountID) {
		this.accountId = accountID;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void accountSummary() {
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("AccountID: " + this.accountId);
		System.out.println("Account Balance: " + this.balance);
	}
}
