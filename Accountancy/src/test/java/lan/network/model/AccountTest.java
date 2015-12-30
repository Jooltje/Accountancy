package lan.network.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void setNumber() {
		Account account = new Account();
		account.setNumber(44000);
		Assert.assertEquals(44000, account.getNumber());
	}
	
	@Test
	public void setDescription(){
		Account account = new Account();
		account.setDescription("description");
		Assert.assertEquals("description", account.getDescription());
	}

}
