package Class.accessModifiers;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item){
        if(itemCount >= items.length){
            System.out.println("장바구니가 초과 되었습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void infoItems(){
        System.out.println("장바구니 목록:");
        for(int i = 0; i<itemCount; i++){
            Item item = items[i];
            System.out.println("상품명: "+item.getName()+", 합계: "+item.getTotalPrice());
        }

        System.out.println("총합 가격: "+calculateTatoalPrice());
    }

    public int calculateTatoalPrice(){
        int totalPrice = 0;
        for(int i =0; i<itemCount; i++){
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
