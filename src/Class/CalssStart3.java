package Class;

public class CalssStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.age = 20;
        student1.grade=90;
        student1.name = "홍길동";

        Student student2 = new Student();
        student2.age = 30;
        student2.grade = 90;
        student2.name = "임꺽정";

        System.out.println("이름: "+student1.name+" 나이: "+student1.age + "성적: "+student1.grade);
        System.out.println("이름: "+student2.name+" 나이: "+student2.age + "성적: "+student2.grade);

        System.out.println(student1);
        System.out.println(student2);
    }

}
