package Class.accessModifiers;

public class Movie {
    private String title;
    private int runningTime;

    public Movie(String title, int runningTime){
        this.title = title;
        this.runningTime = runningTime;
    }

    public String getTitle(){
        return title;
    }

    public int getRunningTime(){
        return runningTime;
    }
}
