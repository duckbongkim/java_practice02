package Class.classTest;

public class Movie {
    String title;
    String director;
    int duration;

    public Movie(){
        this("","",0);
    }

    public Movie(String title, String director){
        this(title,director,0);
    }

    public Movie(String title, String director, int duration){
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    void infoMovie(){
        System.out.println("제목: "+title+",감독: "+director+",상영시간: "+duration);
    }
}
