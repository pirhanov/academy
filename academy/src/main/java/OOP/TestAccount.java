  package OOP;

public class TestAccount {

	public static void main(String[] args) {

		Account a1 = new Account(200001, 41.8);
		System.out.println(a1);

		Account a2 = new Account();
		System.out.println(a2);

		Account a3 = new Account(132354);
		System.out.println(a3);

		a1.setBalance(41.9);
		System.out.println(a1);
		System.out.println("Account nuber: " + a1.getAccountNumber() + " " + "Balance: " + a1.getBalance());

		a1.debit(14);
		System.out.println(a1);
		System.out.println();
		a1.credit(50);
		System.out.println(a1);

	}

}
