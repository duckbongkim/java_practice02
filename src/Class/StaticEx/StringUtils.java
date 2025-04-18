package Class.StaticEx;

public class StringUtils {
    private StringUtils(){}

    public static int getLength(String str){
        if (str == null){
            return 0;
        }
        return str.length();
    }

    public static boolean isEmpty(String str){
        if(str == null){
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String str){
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean contains(String str, String keyword){
        if(str==null || keyword == null){
            return true;
        }
        return str.contains(keyword);
    }
}
