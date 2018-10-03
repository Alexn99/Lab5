import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /**
     * List of bank account types.
     */
    public enum BankAccountType {
        /**
         * Checking account type.
         */
        CHECKINGS,
        /**
         * savings account type.
         */
        SAVINGS,
        /**
         * student account type.
         */
        STUDENT,
        /**
         * workplace account type.
         */
        WORKPLACE
    }

    /**
     * tracks number of accounts.
     */
    private static int numberOfAccounts = 0;
    /**
     * ID number of the account.
     */
    private int accountNumber;
    /**
     * type of the bank account.
     */
    private BankAccountType accountType;
    /**
     * balance of the bank account.
     */
    private double accountBalance;
    /**
     * name of the account owner.
     */
    private String ownerName;
    /**
     * interest rate for the account.
     */
    private double interestRate;
    /**
     * total interest earned by the account.
     */
    private double interestEarned;

    /**
     * creates a new account.
     * @param name name of the new account's owner.
     * @param accountCategory type of the new account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /**
     *
     * @param an new account number input.
     */
    public void setAccountNumber(final int an) {
        accountNumber = an;
    }

    /**
     *
     * @param bat new account type
     */
    public void setAccountType(final BankAccountType bat) {
        accountType = bat;
    }

    /**
     *
     * @param b new account balance
     */
    public void setAccountBalance(final double b) {
        accountBalance = b;
    }

    /**
     *
     * @param n new account owner name.
     */
    public void setOwnerName(final String n) {
        ownerName = n;
    }

    /**
     *
     * @param ir new account interest rate.
     */
    public void setInterestRate(final double ir) {
        interestRate = ir;
    }

    /**
     *
     * @param ie new interest earned value.
     */
    public void setInterestEarned(final double ie) {
        interestEarned = ie;
    }

    /**
     *
     * @return returns account type.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     *
     * @return returns account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @return returns account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @return returns interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @return returns interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     *
     * @return returns owner name.
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @return retuns number of accounts.
     */
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
}
