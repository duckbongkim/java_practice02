package Class.accessModifiers;

public class MovieManager {
    private Movie[] movies = new Movie[5];
    private int count;

    public void addMovie(Movie movie){
        if(count >= movies.length){
            System.out.println("5개를 초과 할 수 없습니다.");
            return;
        }
        movies[count] = movie;
        count++;
    }

    public void infoMovies(){
        System.out.println("현재 상영중인 영화: ");
        for(int i=0; i<count; i++){
            Movie movie = movies[i];
            System.out.println("영화제목: "+movie.getTitle()+", 상영시간: "+movie.getRunningTime()+"분");
        }
        System.out.println("평균 상영시간: "+getTotalTime());
    }

    public int getTotalTime(){
        int totalTime = 0;
        for(int i=0; i<count; i++){
            totalTime += movies[i].getRunningTime();
        }
        return totalTime/count;
    }
}
