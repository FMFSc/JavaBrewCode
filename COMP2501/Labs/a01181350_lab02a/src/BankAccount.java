//Fellipe Matheus Fumagali Scirea - S.N. #A01181350

public class BankAccount {
	private String memberLastName;
	private int accountNumber;
	private float balanceCdn;
	
	public BankAccount(String memberLastName, int accountNumber, float balanceCdn) {
		super();
		this.memberLastName = memberLastName;
		this.accountNumber = accountNumber;
		this.balanceCdn = balanceCdn;
	}

	public String getMemberLastName() {
		return memberLastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public float getBalanceCdn() {
		return balanceCdn;
	}

	public void setMemberLastName(String memberLastName) {
		this.memberLastName = memberLastName;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalanceCdn(float balanceCdn) {
		this.balanceCdn = balanceCdn;
	}

	//withdraw method 
	public void withdraw(double amountCdn) {
		if (amountCdn <= 0) {
			System.out.println("Withdraw amounts should be positive.");
		}
		if (amountCdn > balanceCdn) {
			balanceCdn -= amountCdn;
		}
		System.out.println("Insuficient funds.");
	}

	//deposit method
	public void deposit(double amountCdn) {
		if (amountCdn <= 0) {
			System.out.println("Deposit should be greater than zero.");
		}
		else {
			balanceCdn += amountCdn;
		}
	}
	
	public void transfer(double amountCdn, BankAccount depositantAccount, BankAccount recipientAccount) {
		if(amountCdn >= BankAccount.depositantAccount) {
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
