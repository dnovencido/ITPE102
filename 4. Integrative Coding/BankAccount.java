public class BankAccount {
	private int acctNum;
	private double balance;

	public BankAccount(int num, double bal) {
		acctNum = num;
		balance = bal;
	}

	@Override
	public String toString() {
		String info = "Bank Account number is " + acctNum + " Balance = $" + balance;
		return info;
	}
}

