import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {

	Map<String, BankAccount> accounts = new HashMap<>();
	
	public void add(BankAccount account) {
		accounts.put(account.getAccountNumber(), account);
	}

	public BankAccount findAccount(String accountNum) {
		return accounts.get(accountNum);
		
	}

	public Collection<BankAccount> getAllAccounts() {
		return accounts.values();
	}

	public void close(BankAccount account) {
		accounts.remove(account.getAccountNumber(), account);
		
	}

	public void withdraw(String accountNumber, int amount) {
		BankAccount withdrawFromAccount = findAccount(accountNumber);
		withdrawFromAccount.withdraw(amount);
		
	}

	public void add(String accountNumber, int amount) {
		BankAccount depositToAccount = findAccount(accountNumber);
		depositToAccount.deposit(amount);
		
	}

	public BankAccount accounts() {
		
		return accounts.get(getAccountNumber());
	}

	public BankAccount getBankAccount() {
		
		return accounts.get(getAccountNumber());
	}

	public BankAccount getAccountNumber() {
		
		return accounts();
	}

	public BankAccount getAccountNum(Long accountNum) {
		
		return getAccountNumber();
	}

	public String getbalance() {
		
		return getbalance();
	}

	public void closeAccount() {
		
		 accounts.remove(getAccountNumber());
		
	}

	public void closeAccount(int accountNumber) {

         accounts.remove(getAccountNumber());
		
	}

	
	}

	
	

	
	


