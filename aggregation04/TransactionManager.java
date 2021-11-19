package by.introduction.fourth.aggregation04.main;

public class TransactionManager {

	public void deposit(Account account, int deposit) {
		if (account.isBlockedStatus() == true) {
			account.setAmount(account.getAmount() + 0);
			System.out.println("Account is blocked. No transactions permitted.");
		} else {
			account.setAmount(account.getAmount() + deposit);
			System.out.println(deposit + " " + account.getCurrency().getCurrencyCode() + " deposited");
		}
	}

	public void withdraw(Account account, int w) {
		if (account.isBlockedStatus() == true) {
			account.setAmount(account.getAmount() - 0);
			System.out.println("Account is blocked. No transactions permitted.");
		} else if (w < account.getAmount()) {
			account.setAmount(account.getAmount() - w);
			System.out.println(w + " " + account.getCurrency().getCurrencyCode() + " withdrawn");
		} else {
			System.out.println("You can't withdraw  " + w + " " + account.getCurrency().getCurrencyCode() + "!");
		}

	}

	public void blockAccount(Account account) {
		account.setBlockedStatus(false);
	}

	public void unBlockAccount(Account account) {
		account.setBlockedStatus(true);
	}
}
