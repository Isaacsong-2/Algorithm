import java.util.Arrays;

public class 문자열정렬하기2 {
    public String solution(String my_string) {
        String[] strArr = my_string.toLowerCase().split("");
        Arrays.sort(strArr);
        String answer = String.join("", strArr);
        return answer;
    }

    public static void main(String[] args) {
        문자열정렬하기2 sol = new 문자열정렬하기2();
        System.out.println(sol.solution("Bcad"));
    }
}
