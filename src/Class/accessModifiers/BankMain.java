package Class.accessModifiers;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(1000);
        bankAccount.withdraw(1000);

        System.out.println("잔액: "+bankAccount.getBalance());
    }
}
