package Class.accessModifiers;

public class Library {
   private Book[] books = new Book[10];
   private int count = 0;

   public void addBook(Book book){
       if(count >= books.length){
           System.out.println("10권을 초과할수없습니다.");
           return;
       }
       books[count]=book;
       count++;
   }

   public void infoBooks(){
       System.out.println("도서관 목록: ");
       for(int i =0; i< count; i++){
           Book book = books[i];
           System.out.println("제목: "+book.getTitle()+", 저자: "+book.getAuthor()+", 권수: "+book.getQuantity());
       }
       System.out.println("총 권수: "+getTotalBooks());
   }

   public int getTotalBooks(){
       int totalBooks=0;
       for(int i =0; i<count; i++){
           totalBooks += books[i].getQuantity();
       }
       return totalBooks;
   }
}
