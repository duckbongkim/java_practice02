package Class;

public class ReferenceType2 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.grade =10;
        Student s2 = s1;

        s1.grade=20;

        System.out.println("s1.grade: "+s1.grade);
        System.out.println("s2.grade: "+s2.grade);

    }
}
