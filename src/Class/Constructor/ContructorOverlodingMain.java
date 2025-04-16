package Class.Constructor;

public class ContructorOverlodingMain {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member("우투리",20,90);

        member1.showInfo();
        member2.showInfo();
    }
}
