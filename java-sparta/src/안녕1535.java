import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 안녕1535 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n + 1][100];
        int[] l = new int[n + 1];
        int[] j = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            l[i] = Integer.parseInt(st.nextToken());
            j[i] = Integer.parseInt(st2.nextToken());
        }
//        dp[n][k]가 의미하는 것은 n번째사람을 만났을때 세준이의 체력이 k라면 얻을 수 있는 기쁨의 최댓값
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= 99; k++) {
                if (k - l[i] >= 0) {
                    dp[i][k] = Math.max(dp[i - 1][k - l[i]] + j[i], dp[i - 1][k]);
                } else dp[i][k] = dp[i - 1][k];
            }
        }
        System.out.println(dp[n][99]);
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
