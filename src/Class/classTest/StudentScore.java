package Class.classTest;

public class StudentScore {
    String name;
    int kor;
    int eng;
    int math;

    public StudentScore(String name, int kor, int eng, int math){
        this.name = name;
        this.eng = eng;
        this.kor = kor;
        this.math = math;
    }

    public int getTotal(){
        int sum;
        sum = kor+eng+math;
        return sum;
    }

    public double getAverage(){
        double avg = (kor+eng+math)/3;
        return avg;
    }

    void printInfo(){
        System.out.println(name+"- 총점: "+getTotal()+", 평균: "+getAverage());
    }
}
