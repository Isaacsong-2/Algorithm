public class 최빈값구하기 {
    public int solution(int[] array) {
        int[] sol = new int[1000];
        int answer = 0;
        int max = 0;
        for (int i : array){
            sol[i] += 1;
            if (sol[i] > max){
                max = sol[i];
                answer = i;
            } else if (sol[i] == max){
                answer = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        최빈값구하기 sol = new 최빈값구하기();
        int[] array = {1, 1, 1, 2, 2, 2, 2, 3, 3, 4};
        int ans = sol.solution(array);
        System.out.println(sol.solution(array));
    }
}