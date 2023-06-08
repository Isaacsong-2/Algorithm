public class 문자열뒤집기 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++){
            answer = my_string.charAt(i) + answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열뒤집기 sol = new 문자열뒤집기();
        System.out.println(sol.solution("jaron"));
    }
}
