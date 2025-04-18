package Class.classTest;

public class Product {
    String name;
    int price;
    int cnt;

    public Product(String name, int price, int cnt){
        this.name = name;
        this.price = price;
        this.cnt = cnt;
    }

    public int getTotalPrice(){
        return price*cnt;
    }

    void printInfo(){
        System.out.println("상품명: "+name+", 가격: "+price+", 수량: "+cnt+", 총액: "+getTotalPrice());
    }
}
