public class 숫자찾기 {
    public int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(String.valueOf(k)) + 1;
        return answer == 0 ? -1 : answer;
    }

    public static void main(String[] args) {
        숫자찾기 sol = new 숫자찾기();
        System.out.println(sol.solution(29183, 1));
    }
}
