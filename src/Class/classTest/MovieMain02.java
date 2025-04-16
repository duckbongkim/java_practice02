package Class.classTest;

public class MovieMain02 {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie("홍길동","원균");
        Movie movie3 = new Movie("임꺽정","아기장수 우투리",50);

        movie1.infoMovie();
        movie2.infoMovie();
        movie3.infoMovie();
    }
}
