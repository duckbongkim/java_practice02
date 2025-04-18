package Class;

class Data01 {
    int value;
    static int count;

    void print(){
        System.out.println("value: "+value++);
        System.out.println("count: "+count++);
    }
}

public class Code107 {
    public static void main(String[] args) {
        Data01 data1 = new Data01();
        Data01 data2 = new Data01();

        data1.print();
        data2.print();
    }
}
