package test02;

public class Test05 {
    public static void main(String[] args) {
        int balance = 1000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);
    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount+"원을 입금하였습니다. 현재 잔액: "+ balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount+"원을 출금하였습니다. 현재 잔액: "+balance+ "원");
        }
        return balance;
    }
}
