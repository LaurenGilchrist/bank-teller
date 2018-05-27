import java.util.Scanner;

public class BankApp {

	static int choice;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Bank myBank = new Bank();
		
		BankAccount account1 = new BankAccount("1111", "Checking", 500);
		BankAccount account2 = new BankAccount("2222", "Savings", 2500);
		
		myBank.add(account1);
		myBank.add(account2);
		
		System.out.println("These are your account with us: ");
		for(BankAccount current: myBank.getAllAccounts()) {
			System.out.println(current.getType() + " "  + current.getBalance());
			
		}
		
		menuOption();
		
		System.out.println("What would you like to do?");
		System.out.println("Choose an option: ");
		System.out.println("Press 1 to deposit funds");
		System.out.println("Press 2 to withdraw funds");
		System.out.println("Press 3 to check your balance");
		System.out.println("Press 4 to close an account");
		System.out.println("Press 5 to exit");
		String menuOption = input.nextLine();
		
		while(!menuOption.equals("5")) {
			if(choice == 1);
			System.out.println("You want to deposit");
			System.out.println("Here are your accounts");
			for(BankAccount current: myBank.getAllAccounts()) {
				System.out.println(current.getAccountNumber() + " " +  current.getType() + " " + current.getBalance());
				
			}
			
			System.out.println("Select the account by (account number) to perform this transaction");
		    Long accountNum = input.nextLong();
		    System.out.println("You have selected " + accountNum);
		    System.out.println("Enter the amount to deposit: ");
		    double amount = input.nextDouble();
		    myBank.getBankAccount().deposit(amount);
		    System.out.println("Your current balance is " + myBank.getAccountNumber().getBalance());
		    
		   

			
			
		}
		
		
		
		
		
		
		
	}

	private static void menuOption() {
		// TODO Auto-generated method stub
		
	}

}
