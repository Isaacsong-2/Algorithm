import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 배열의유사도 {
    public int solution(String[] s1, String[] s2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(s1));
        Set<String> set2 = new HashSet<>(Arrays.asList(s2));
        set1.retainAll(set2);
        int answer = set1.size();
        return answer;
    }

    public static void main(String[] args) {
        배열의유사도 sol = new 배열의유사도();
        String[] str1 = {"a","b","c"};
        String[] str2 = {"com","b","d","p","c"};

        System.out.println(sol.solution(str1, str2));
    }
}
