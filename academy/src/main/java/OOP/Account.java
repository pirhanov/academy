package OOP;

public class Account {
	private int accountNumber;
	private double balance;

	public Account() {
		super();
	}

	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Account(int accountNumber) { // constructer deafolt;
		this.accountNumber = accountNumber;
		this.balance = 0.0;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void credit(double amount) {
		balance += amount;
	}

	public void debit(double amount) {
		if (balance < amount) {
			System.out.println("Amount more than balance!");
		} else {
			balance -= amount;
		}

	}

	@Override
	public String toString() {
		return String.format("Account number:%d, Balance= %2f", accountNumber, balance);
	}

}
