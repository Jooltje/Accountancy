package lan.network.model;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class EntryTest {

	@Test
	public void setAccount() {
		Entry entry = new Entry();
		Account account = new Account(44000,"leveranciers");
		entry.setAccount(account);
		Assert.assertEquals(account, entry.getAccount());
	}
	
	@Test
	public void setDebit(){
		Entry entry = new  Entry();
		BigDecimal value = new BigDecimal("88.13");
		entry.setDebit(value);
		Assert.assertTrue(value.compareTo(entry.getDebit()) == 0);
	}

	@Test
	public void setCredit(){
		Entry entry = new  Entry();
		BigDecimal value = new BigDecimal("10.12");
		entry.setCredit(value);
		Assert.assertTrue(value.compareTo(entry.getCredit()) == 0);
	}
	
	@Test
	public void defaultDebitValueIsZero(){
		Entry entry = new Entry();
		Assert.assertTrue(BigDecimal.ZERO.compareTo(entry.getDebit()) == 0);
	}
	
	@Test
	public void defaultCreditValueIsZero(){
		Entry entry = new Entry();
		Assert.assertTrue(BigDecimal.ZERO.compareTo(entry.getCredit()) == 0);
	}
	
}
