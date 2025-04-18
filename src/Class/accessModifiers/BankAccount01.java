package Class.accessModifiers;

public class BankAccount01 {
    private int balance;

    public BankAccount01(){
        balance = 0;
    }

    private boolean isAmountValid(int amount){
        return amount > 0;
    }

    public void deposit(int amount){
        if (isAmountValid(amount)){
            balance += amount;
            System.out.println(amount+"원이 입금되었습니다. 현재 잔액: "+balance);
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount){
        if(isAmountValid(amount)&&balance-amount>=0){
            balance -= amount;
            System.out.println(amount+"원이 출금되었습니다. 현재 잔액: "+amount);
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBalance(){
        return balance;
    }

}
