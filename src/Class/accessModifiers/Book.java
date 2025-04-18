package Class.accessModifiers;

public class Book {
    String title;
    String author;
    int quantity;

    public Book(String title, String author, int quantity){
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getQuantity(){
        return quantity;
    }
}
