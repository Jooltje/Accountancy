package lan.network.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lan.network.validation.Equilibrium;

@Equilibrium
public class Transaction {

	private List<Entry> entries;
	
	public Transaction() {
		entries = new ArrayList<>(3);
	}
	
	public BigDecimal getCredit() {
		BigDecimal credit = BigDecimal.ZERO;
		for (Entry entry : entries) {
			credit = credit.add(entry.getCredit());
		}
		return credit;
	}

	public BigDecimal getDebit() {
		BigDecimal debit = BigDecimal.ZERO;
		for (Entry entry : entries) {
			debit = debit.add(entry.getDebit());
		}
		return debit;
	}

	public List<Entry> getEntries() {
		return entries;
	}

	public void add(Entry entry) {
		entries.add(entry);
	}

	public void remove(Entry entry) {
		entries.remove(entry);
	}
	
}
