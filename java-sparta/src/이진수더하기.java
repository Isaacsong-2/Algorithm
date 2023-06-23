import java.nio.charset.StandardCharsets;

public class 이진수더하기 {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2, 2));
    }
    public static void main(String[] args) {
        이진수더하기 sol = new 이진수더하기();
        System.out.println(sol.solution("10", "11"));
    }
}
