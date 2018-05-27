
public class BankAccount {

	private String accountNumber;
	private int balance;
	private String type;

	public BankAccount(String accountNumber , String type, int balance) {
		this.accountNumber = accountNumber;
		this.type = type; 
		this.balance = balance;
		
	}

	public String getAccountNumber() {
	
		return accountNumber;
	}

	public int getBalance() {
		
		return balance;
	}

	public void withdraw(int amount) {
		balance -= amount;
		
	}

	public void deposit(int amount) {
		balance += amount;

		
	}

	public String getType() {
		
		return type;
		
	}

	public Object getDeposit() {
		
		return balance;
	}

	public static BankAccount get(BankAccount bankAccount) {
		
		return bankAccount;
	}

	

	
	}


