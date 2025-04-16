package Class;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "홍길동";
        student1.age = 20;
        student1.grade = 80;

        student2.name = "임꺽정";
        student2.age = 30;
        student2.grade = 90;

        Student[] students = {student1,student2};

//        for(int i =0; i<students.length; i++){
//            System.out.println("이름: "+students[i].name+" 나이: "+students[i].age+" 성적: "+students[i].grade);
//        }
        for (Student s : students){
            System.out.println("이름: "+s.name+" 나이: "+s.age+" 성적: "+s.grade);
        }
    }
}
