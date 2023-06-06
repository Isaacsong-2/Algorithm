import java.util.ArrayList;

public class 배열두배만들기 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        배열두배만들기 sol = new 배열두배만들기();
        System.out.println(sol.solution(new int[] {1,1,2,2,3,3}));
    }
}
