package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount extends Accounts{
    private static final float INTEREST_PERCENTAGE = 0.04f;
    private Money balance = new Money();
//    private CheckingAccount registeredCounterAccount;

    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
        // 2. Assuming result is 9-digit bank account number, validate 11-test:
        if (Accounts.isValid(counterAccount)){
        	CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
        	Transfer result = new Transfer(this, acct, amount);
        	return result;
        	
        } else {
            throw new BusinessException("Invalid account number!");
        }
    }
}
// end::SavingsAccount[]
