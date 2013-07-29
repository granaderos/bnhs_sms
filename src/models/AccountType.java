package models;

public class AccountType {
	protected String account_type;
	protected int id;
	
	public AccountType(int id, String account_type) {
		this.account_type = account_type;
		this.id = id;
	}
	
	public void setAccountType(String account_type) {
		this.account_type = account_type;
	}
	
	public String getAccountType() {
		return account_type;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	 
}
