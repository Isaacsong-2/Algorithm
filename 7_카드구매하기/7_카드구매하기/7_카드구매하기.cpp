#include <iostream>

#define endl "\n"
#define Max 1001
using namespace std;

int n;
int arr[Max];
int dp[Max];

void input() {
    cin >> n;
    for (int i = 1; i <= n; i++) {
        cin >> arr[i];
    }
}
int main()
{
    input();
    dp[1] = arr[1];
    for (int i = 2; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            if (dp[i] < dp[i - j] + arr[j]) {
                dp[i] = dp[i - j] + arr[j];
            }
        }
    }
    cout << dp[n];
    return 0;
}

