package Class.accessModifiers;

public class MovieMain {
    public static void main(String[] args) {
        MovieManager manager = new MovieManager();

        Movie movie1 = new Movie("인셉션",160);
        Movie movie2 = new Movie("인터스텔라",140);
        Movie movie3 = new Movie("데넷",200);


        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        manager.infoMovies();

    }
}
