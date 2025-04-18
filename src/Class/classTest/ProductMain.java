package Class.classTest;

public class ProductMain {


    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Product("키보드",3000,3);
        products[1] = new Product("모니터",50000,3);
        products[2] = new Product("마우스",2000,3);

        for(Product p : products){
            p.printInfo();
        }
    }
}
