import java.util.Arrays;

public class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = Arrays.stream(array).filter(value -> value > height).toArray().length;
        return answer;
    }

    public static void main(String[] args) {
        머쓱이보다키큰사람 sol = new 머쓱이보다키큰사람();
        int[] arr = {149,180,192,170};
        System.out.println(sol.solution(arr,3));
    }
}
