package Class.classTest;

public class AccmountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(1000);
        account.withdraw(900);
        account.withdraw(200);

        System.out.println("현재 잔고: "+account.balance);
    }
}
