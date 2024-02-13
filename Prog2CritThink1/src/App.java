
public class App {
	public static void main(String[] args) {
		CheckingAccount myChecking = new CheckingAccount(500, .1, "Joe", "Smith", 999);
		myChecking.displayAccount();;
		myChecking.processWithdrawal(1000);
		myChecking.deposit(2000);
		myChecking.displayAccount();
	}
}
