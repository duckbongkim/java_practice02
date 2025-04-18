package Class.accessModifiers;

public class LibrarMian {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("해리포터","롤링",2);
        Book book2 = new Book("어린왕자","페리",3);

        library.addBook(book1);
        library.addBook(book2);

        library.infoBooks();
    }
}
