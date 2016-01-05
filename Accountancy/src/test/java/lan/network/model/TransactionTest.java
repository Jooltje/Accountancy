package lan.network.model;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class TransactionTest {

	@Test
	public void defaultCreditValueIsZero(){
		Transaction transaction = new Transaction();
		Assert.assertTrue(BigDecimal.ZERO.compareTo(transaction.getCredit()) == 0);
	}
	
	@Test
	public void defaultDebitValueIsZero(){
		Transaction transaction = new Transaction();
		Assert.assertTrue(BigDecimal.ZERO.compareTo(transaction.getDebit()) == 0);
	}
	
	@Test
	public void defaultEntriesIsEmpty(){
		Transaction transaction = new Transaction();
		Assert.assertTrue(transaction.getEntries().isEmpty());
	}
	
	@Test
	public void addEntry(){
		Transaction transaction = new Transaction();
		transaction.add(new Entry());
		Assert.assertEquals(transaction.getEntries().size() , 1);
	}

	@Test
	public void removeEntry(){
		Transaction transaction = new Transaction();
		Entry entry = new Entry();
		transaction.add(entry);
		transaction.remove(entry);
		Assert.assertTrue(transaction.getEntries().isEmpty());
	}
	
	public void example(){
		Transaction transaction = new Transaction();
		transaction.add(new Entry(new Account(), new BigDecimal("10"), new BigDecimal("0")));
		transaction.add(new Entry(new Account(), new BigDecimal("0"), new BigDecimal("10")));
		
	}
	
	
}
