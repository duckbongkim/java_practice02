package Class.accessModifiers;

public class BankAccount {
    private int balance = 1000;
    
    public void deposit (int amount){
        balance += amount;
    }
    
    public void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }

    public int getBalance(){
        return balance;
    }
}
