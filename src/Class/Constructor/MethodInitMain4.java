package Class.Constructor;

public class MethodInitMain4 {
    public static void main(String[] args) {
        MemberInit02 member1 = new MemberInit02("홍길동",20,90);
        MemberInit02 member2 = new MemberInit02("우투리",30,20);

        MemberInit02[] members = {member1, member2};

        for (MemberInit02 m : members){
            System.out.println("이름: "+m.name+"나이: "+m.age+"성적: "+m.grade);
        }
    }
}
