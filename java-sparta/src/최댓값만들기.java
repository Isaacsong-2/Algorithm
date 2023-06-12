import java.util.Arrays;

public class 최댓값만들기 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        int answer = numbers[n-1] * numbers[n-2];
        return answer;
    }

    public static void main(String[] args) {
        최댓값만들기 sol = new 최댓값만들기();
        int[] numbers = {0, 31, 24, 10, 1, 9};
        System.out.println(sol.solution(numbers));
    }
}
