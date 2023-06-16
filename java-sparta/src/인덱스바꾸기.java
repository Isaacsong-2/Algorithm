public class 인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        String[] strArr = my_string.split("");
        String temp;
        temp = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = temp;
        return String.join("", strArr);
    }

    public static void main(String[] args) {
        인덱스바꾸기 sol = new 인덱스바꾸기();
        System.out.println(sol.solution("I love you", 3, 6));
    }
}
