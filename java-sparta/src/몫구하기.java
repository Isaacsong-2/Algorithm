public class 몫구하기 {
    public int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }
    public static void main(String[] args) throws Exception {
        몫구하기 sol = new 몫구하기();
        int ans = sol.solution(7, 2);
        System.out.println(ans);
    }
}