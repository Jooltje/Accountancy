package lan.network.model;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void setNumber() {
        Account account = new Account(44000, "description");
        Assert.assertEquals(44000, account.getNumber());
    }

    @Test
    public void setDescription() {
        Account account = new Account(44000, "description");
        Assert.assertEquals("description", account.getDescription());
    }

}
