package Class.classTest;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder();
        ProductOrder productOrder2 = new ProductOrder();
        ProductOrder productOrder3 = new ProductOrder();

        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.count=2;

        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.count = 1;

        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.count = 2;


        ProductOrder[] productOrders = {productOrder1,productOrder2,productOrder3};
        int total = 0;

        for(ProductOrder p : productOrders){
            System.out.println("상품명: "+p.productName+" 가격: "+p.price+" 수량: "+p.count);
            total += p.price*p.count;
        }
        System.out.println("총결제 금액: "+total);
    }
}
