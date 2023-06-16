public class 대문자와소문자 {
    public String solution(String my_string) {
        String answer = "";
        char currentChar;
        for (int i = 0; i < my_string.length(); i++) {
            currentChar = my_string.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                answer += Character.toUpperCase(currentChar);
            } else {
                answer += Character.toLowerCase(currentChar);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        대문자와소문자 sol = new 대문자와소문자();
        System.out.println(sol.solution("cccCCC"));
    }
}
