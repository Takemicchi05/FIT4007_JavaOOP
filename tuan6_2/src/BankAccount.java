public class BankAccount {
    private double balance;
    private int accountnumber;
    private static int lastAssigneNumber = 1000;
    public static final double OVERDRAFT_FEE = 0.02;

    public BankAccount() {
        lastAssigneNumber++;
        accountnumber = lastAssigneNumber;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public static void showInfo() {
        System.out.println("Account number: " + accountnumber);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft fee: " + OVERDRAFT_FEE);

    }
}
