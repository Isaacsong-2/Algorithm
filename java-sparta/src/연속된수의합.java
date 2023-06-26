public class 연속된수의합 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        double avg = (double) total / num;
        for (int i = 0; i < num; i++) {
            answer[i] = (int) (avg + i - (num - 1) / 2.0);
        }
        return answer;
    }

    public static void main(String[] args) {
        연속된수의합 sol = new 연속된수의합();
        System.out.println(sol.solution(5, 5));
    }
}
