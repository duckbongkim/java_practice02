package Class.Constructor;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        MemberInit member2 = new MemberInit();

        member1.initMember("홍길동",20,90);
        member2.initMember("우투리",20,80);

        MemberInit[] members = {member1,member2};

        for(MemberInit m : members){
            System.out.println("이름"+m.name+"나이"+m.age+"성적"+m.grade);
        }
    }
}
