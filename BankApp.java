
class Transactions extends PolarisBank{
 private String transactionType;
 public float balance;
	public Transactions(String cN, float bl, String at) {
		super(cN, bl, at);
		balance = bl;
		
		
	}
	
	public void deposit(float amt) {
		 balance  = balance+amt;
	}
	//
	
	public float getBal() {
		return balance;
	}
	
	
	public void withdraw(float amt) {
		//
		if (balance > amt) {
			balance = balance - amt;
		}
		
	}
	
}

 class PolarisBank {

protected String customername;
protected float balance;
protected String accountType;
//

public PolarisBank(String cN, float bl, String at) {
	customername = cN;
	balance = bl;
	accountType = at;
}

//
public float getBal() {
	return balance;
}
public String getCustomerName() {
	return customername;
}

public String getAccountType() {
	return accountType;
}
//


}
 
 public class BankApp  {
	 
	 
	 public static void main(String args[]) {
		 String name = "Agbeniga Musefiu Oyebanji";
		 float balance  = (float) 456726.25;
		 String accountType = "Current";
		 //
		 PolarisBank cust = new PolarisBank(name, balance, accountType);
		 //
		 System.out.println("Account Name :"+cust.getCustomerName());
		 System.out.println("Account Type : "+cust.getAccountType()+" Account");
		 System.out.println("Account Balance :"+cust.getBal());
		 
		 //Perform New Transactions
		 
		 Transactions transact = new Transactions(name, balance, accountType);
		//deposit 3357
		 transact.deposit(3357);
		 System.out.println("New Balance after depositing 3357 is : "+transact.getBal());
		 
		 //withdraw 5500
		 transact.withdraw(5500);
		 System.out.println("New Balance after withdrawing  5500 is : "+transact.getBal());
		 
	 }
	 
 }
