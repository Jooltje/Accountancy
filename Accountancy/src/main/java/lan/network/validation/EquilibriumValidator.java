package lan.network.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import lan.network.model.Transaction;

public class EquilibriumValidator implements ConstraintValidator<Equilibrium, Transaction> {

	@Override
	public void initialize(Equilibrium constraintAnnotation) {
	}

	@Override
	public boolean isValid(Transaction transaction, ConstraintValidatorContext context) {
		return transaction.getDebit().compareTo(transaction.getCredit()) == 0;
	}

}
