package BankAccount;

public class BankAccountTest { 
	 
	public static void main(String[] args) {
		BankAccount1 neeranAccount = new BankAccount1("neeran");
		
		neeranAccount.depositFund(500);
		neeranAccount.withdrawFund(200);
		
		BankAccount1 kiranAccount = new BankAccount1("kiran", 2000);
		kiranAccount.withdrawFund(200);
		kiranAccount.depositFund(500);
		
		neeranAccount.depositFund(700);
		

	}

}


