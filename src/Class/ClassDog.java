package Class;

class Dog{
    String name;
    int age;
}

public class ClassDog {
    public static void main(String[] args) {
        Dog happy = new Dog();
        Dog happy2 = new Dog();

        happy.name = "happy";
        happy.age = 10;

        happy2.name = "happy2";
        happy2.age = 20;

        System.out.println("강아지 아름: "+happy.name+"나이: "+happy.age);
        System.out.println("강아지 이름: "+happy2.name+"나이: "+happy2.age);
    }
}
