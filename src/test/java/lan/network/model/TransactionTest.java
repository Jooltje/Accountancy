package lan.network.model;

import java.math.BigDecimal;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

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
	
	@Test
	public void aTransactionIsInEquilibrium(){
		ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
		Validator validator = vf.getValidator();
		Account account = new Account(44000,"leveranciers");
		Entry entry = new Entry();
		entry.setAccount(account);
		entry.setCredit(BigDecimal.TEN);
		Transaction transaction = new Transaction();
		transaction.add(entry);
		Set<ConstraintViolation<Transaction>> constraints = validator.validate(transaction);
		Assert.assertEquals(1, constraints.size());
	}
	
}
