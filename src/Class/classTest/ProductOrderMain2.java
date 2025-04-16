package Class.classTest;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = createOrder("두부",5000,2);
        productOrders[1] = createOrder("김치",5000,1);
        productOrders[2] = createOrder("콜라",5000,2);

        printOrder(productOrders);
        int totalAmount = totalPrice(productOrders);
        System.out.println("총 결재금액: "+totalAmount);

    }

    static ProductOrder createOrder(String name, int price, int count){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = name;
        productOrder.price = price;
        productOrder.count = count;

        return productOrder;
    }

    static void printOrder(ProductOrder[] orders){
        for(ProductOrder p : orders){
            System.out.println("상품명: "+p.productName + "가격: "+p.price+ "수량: "+p.price);
        }
    }

    static int totalPrice(ProductOrder[] orders){
        int totalPrice = 0;
        for(ProductOrder p : orders){
            totalPrice += p.price*p.count;
        }
        return totalPrice;
    }
}
