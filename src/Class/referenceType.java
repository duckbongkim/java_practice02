package Class;

public class referenceType {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.grade = 20;
        s2.grade = 30;

        int sum = s1.grade + s2.grade;

        System.out.println(sum);
    }


}
