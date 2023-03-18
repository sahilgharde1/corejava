package core.basic.account;

public class AccountTest{

	public static void main(String[] args) {
		Account a;
		a = new Account() ;
		a.setNumber(1236542);
		a.setaccountType("Saving");
		a.setBalance(20000.20);
		
		int Number1 = a.getNumber();
		String accountType1 = a.getaccountType();
		double Balance1 = a.getBalance();
		
		System.out.println("Ac no.- "+Number1);
		System.out.println("account Type -  "+accountType1);
		System.out.println("Balance -  "+Balance1);
		

	}

}
