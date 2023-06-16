import java.util.HashMap;
import java.util.Map;

public class 중복된문자제거 {
    public String solution(String my_string) {
        String answer = "";
        Map<String, Boolean> dict = new HashMap<>();
        String[] strArr = my_string.split("");
        for (String str : strArr){
            if (!dict.containsKey(str)){
                dict.put(str, true);
                answer = answer + str;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        중복된문자제거 sol = new 중복된문자제거();
        System.out.println(sol.solution("people"));
    }
}
