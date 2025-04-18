package Class.accessModifiers;

import java.util.Timer;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalPrice(){
       int total = price*quantity;
       return total;
    }

    public String getName(){
        return name;
    }
}
