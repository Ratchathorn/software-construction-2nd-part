package exception.classes;

/*
ATM Class
 */

public class ATM {
    private BankAccount currentAccount;

    // โยน exception ต่อโดยการใช้ throws Exception (โยนมาจาก withdraw)
    public void doTransaction(String type, double amount) throws NotEnoughMoneyException{
        currentAccount.withdraw(amount);
    }

}
