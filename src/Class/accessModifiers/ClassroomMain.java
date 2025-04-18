package Class.accessModifiers;

public class ClassroomMain {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();

        Student student1 = new Student("철수",30);
        Student student2 = new Student("영희",50);
        Student student3 = new Student("민수",90);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        classroom.infoStudents();


    }
}
