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

//this is a test on git push


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
