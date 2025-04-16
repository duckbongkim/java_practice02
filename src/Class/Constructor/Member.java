package Class.Constructor;

public class Member {
    String name;
    int age;
    int grade;

    public Member(){
        this("언노운",0,0);
    }

    public Member(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void showInfo(){
        System.out.println("이름"+name+"나이"+age+"성적"+grade);
    }
}
