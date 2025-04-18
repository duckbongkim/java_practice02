package Class.accessModifiers;

public class Classroom {
    private Student[] students = new Student[10];
    private int count;

    public void addStudent(Student student){
        if(count >= students.length){
            System.out.println("10명 초과");
            return;
        }
        students[count] = student;
        count++;
    }

    public void infoStudents(){
        System.out.println("학생들: ");
        for(int i=0; i<count; i++){
            Student student = students[i];
            System.out.println("이름: "+student.getName()+"성적: "+student.getScore());
        }
        System.out.println("평균점수: "+getTotal());
    }

    public int getTotal(){
        int total = 0;
        for(int i=0; i<count; i++){
            total += students[i].getScore();
        }
        return total/ count;
    }
}
