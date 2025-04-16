package Class.classTest;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("java","임꺽정");
        Book book3 = new Book("python","홍길동",200);

        book1.InfoBook();
        book2.InfoBook();
        book3.InfoBook();
    }
}
