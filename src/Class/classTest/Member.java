package Class.classTest;

public class Member {
    String name;
    String email;
    int age;

    public Member(String name,  int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public boolean isAdult(){
        if(age >= 20){
            return true;
        } else {
            return false;
        }
    }

    public void printInfo(){
        String status = isAdult() ? "(성인)" : "(미성년)";
        System.out.println("이름: "+name+", 나이: "+age+", "+status+", 이메일: "+email);
    }
}
