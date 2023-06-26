import java.util.Arrays;

public class 로그인성공 {
    public String solution(String[] id_pw, String[][] dbs) {
        for (String[] db : dbs){
            if(id_pw[0].equals(db[0])){
                if (id_pw[1].equals(db[1])) return "login";
                return "wrong pw";
            }
        }
        return "fail";
    }
    public static void main(String[] args) {

    }
}
