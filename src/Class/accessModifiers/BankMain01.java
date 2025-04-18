package Class.accessModifiers;

public class BankMain01 {
    public static void main(String[] args) {
        BankAccount01 account01 = new BankAccount01();

        account01.deposit(1000);
        account01.withdraw(300);
        account01.withdraw(1000);

        System.out.println("잔액: "+account01.getBalance());
    }
}
