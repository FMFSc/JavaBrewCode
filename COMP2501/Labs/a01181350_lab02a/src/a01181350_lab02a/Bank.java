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
	
	public void removeAccount(String accountNumber) {
		accounts.remove(accountNumber);
	}
	
	public int getNumberOfAccounts() {
		return accounts.size();
	}
	
	public double getTotalAccountsBalance() {
		double totalCdn = 0.0;
		for(BankAccount account : accounts.values()) {
			totalCdn += account.getBalanceCdn();
		}
		return totalCdn;
	}
	
	public void depositTo(double amountCdn, String accountNumber) {
		BankAccount account = accounts.get(accountNumber);
		if (account != null) {
			account.deposit(amountCdn);
		}
	}
	
	public void printAllCustomerData() {
		for(BankAccount account:accounts.values()) {
			System.out.printf("Customer %s has CA$%.2f in their account #%s#n",
					account.getMemberLastName().substring(0,1).toUpperCase() + account.getMemberLastName().substring(1),
					account.getBalanceCdn(),
					account.getAccountNumber());
		}
		System.out.printf("Total bank balance in all accounts for %s is %.2f%n", this.bankName, getTotalAccountsBalance());
	}
	
	
	
	

}
