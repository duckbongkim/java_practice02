package Class.classTest;

public class StudentScoreMain {
    public static void main(String[] args) {
        StudentScore[] studentScores = new StudentScore[3];

        studentScores[0] = new StudentScore("홍길동",20,20,20);
        studentScores[1] = new StudentScore("우투리",30,30,30);
        studentScores[2] = new StudentScore("임꺽정",50,50,50);

        for(StudentScore s : studentScores){
            s.printInfo();
        }
    }
}
