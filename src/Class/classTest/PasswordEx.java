package Class.classTest;

public class PasswordEx {
    String password;

    public PasswordEx(String password){
        this.password = password;
    }

//    public Boolean isValid(){
//        if(password.length() < 8){return false;}
//        if (!password.matches(".*[a-z].*")) return false;
//        if (!password.matches(".*[A-Z].*")) return false;
//        if (!password.matches(".*[!@#$%^&*].*")) return false;
//        return true;
//    }

    public Boolean isValid(){
        if(password.length() < 8 || !password.matches(".*[a-z].*") || !password.matches(".*[A-Z].*") || !password.matches(".*[!@#$%^&*].*")
        ) {
            return false;
        } else {
            return true;
        }
    }

    public void printResult(){
        if(isValid()){
            System.out.println("사용가능한 비밀번호 입니다.");
        } else {
            System.out.println("사용이 불가능한 비밀번호입니다.");
        }
    }
}
