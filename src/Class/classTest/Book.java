package Class.classTest;

public class Book {
    String title;
    String author;
    int page;

    public Book(){
        this("","",0);
    }

    public Book(String title, String author){
        this(title,author,0);
    }

    public Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void InfoBook(){
        System.out.println("책 이름: "+ title + " 저자: " + author + " 페이지: " + page);
    }
}
