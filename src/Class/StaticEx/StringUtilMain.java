package Class.StaticEx;

public class StringUtilMain {
    public static void main(String[] args) {

        String str = "keyword";
        String str2 = "key";

        System.out.println("문자열 길이: "+StringUtils.getLength(str));
        System.out.println("문쟈열이 비어있나요? :"+StringUtils.isEmpty(str));
        System.out.println("문자열 뒤집기: "+StringUtils.reverse(str));
        System.out.println("문자열 word가 포함되어있나요?: "+StringUtils.contains(str,str2));

    }
}
