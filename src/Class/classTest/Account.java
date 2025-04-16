package Class.classTest;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
        System.out.println(amount+"원 입금");
    }

    void withdraw(int amount){
        if(balance >= amount){
            System.out.println(amount+"원 출금");
            balance -= amount;
        } else{
            System.out.println("잔액이 부족합니다.");
        }
    }
}
