package in.ashokit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account {
	private String holderName;
	private String branch;
	@EmbeddedId
	private AccountPk accountpk;
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public AccountPk getAccountpk() {
		return accountpk;
	}
	public void setAccountpk(AccountPk accountpk) {
		this.accountpk = accountpk;
	}
	@Override
	public String toString() {
		return "Account [holderName=" + holderName + ", branch=" + branch + ", accountpk=" + accountpk + "]";
	}
	

}
