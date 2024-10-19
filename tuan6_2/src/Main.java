//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        System.out.println(account1.getAccountnumber());
        System.out.println(account2.getAccountnumber());
        System.out.println(BankAccount.OVERDRAFT_FEE);
//        BankAccount.OVERDRAFT_FEE = 0.4;
        BankAccount.showInfo();
    }
}