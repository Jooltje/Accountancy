package lan.network.webservice;

import java.math.BigDecimal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lan.network.model.Account;
import lan.network.model.Entry;
import lan.network.model.Transaction;

@Path("/transaction")
public class TransactionService {

	@GET
	@Produces( MediaType.APPLICATION_JSON)
	public Transaction getTransaction(){
		Transaction transaction = new Transaction();
		transaction.add(new Entry(new Account(44000, "Leveranciers"), BigDecimal.ZERO, BigDecimal.TEN));
		transaction.add(new Entry(new Account(60610, "Vervoer"), BigDecimal.TEN, BigDecimal.ZERO));
		return transaction;
	}
	
}
