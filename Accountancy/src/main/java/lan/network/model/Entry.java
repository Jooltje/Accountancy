package lan.network.model;

import java.math.BigDecimal;

public class Entry {

	private Account account;
	private BigDecimal debit;
	private BigDecimal credit;
		
	public Entry() {
	}
	
	public Entry(Account account, BigDecimal debit, BigDecimal credit){
		this.account = account;
		this.debit = debit;
		this.credit = credit;
	}
	
	public void setDebit(BigDecimal debit) {
		this.debit = debit;
	}
	
	public BigDecimal getDebit() {
		return debit == null ? BigDecimal.ZERO : debit;
	}

	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}
	
	public BigDecimal getCredit() {
		return credit == null ? BigDecimal.ZERO : credit;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

}
