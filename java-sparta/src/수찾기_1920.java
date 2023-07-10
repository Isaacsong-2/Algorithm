import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 수찾기_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        Set<Integer> set = new HashSet<>();
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        for (int i = 0; i< n; i++){
            set.add(Integer.parseInt(st1.nextToken()));
        }

        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for(int i =0; i<n; i++){
            int x = Integer.parseInt(st2.nextToken());
            if (set.contains(x)) {
                System.out.println(1);
            } else System.out.println(0);
        }
    }
}
