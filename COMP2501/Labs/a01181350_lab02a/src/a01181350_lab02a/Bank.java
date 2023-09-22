//Fellipe Matheus Fumagali Scirea - S.N. #A01181350

package a01181350_lab02a;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	private String bankName;
	private Map<String, BankAccount> accounts;
	

	public Bank(String bankName, Map<String, BankAccount> accounts) {
		super();
		this.bankName = bankName;
		this.accounts = accounts;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Map<String, BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<String, BankAccount> accounts) {
		this.accounts = accounts;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void addAccount(BankAccount account) {
		accounts.put(account.getAccountNumber(), account);
	}
	
	public BankAccount getAccount(String accountNumber) {
		return accounts.get(accountNumber);
	}
	
	
	
	
	
	
	

}
