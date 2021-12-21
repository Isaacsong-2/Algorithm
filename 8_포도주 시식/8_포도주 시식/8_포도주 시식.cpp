#include <iostream>
#include <cstring>

#define endl "\n"
#define Max 10001
using namespace std;

int n;
int arr[Max];
int dp[Max];

void input()
{
    cin >> n;
    for (int i = 1; i <= n; i++) {
        cin >> arr[i];
    }
}

int main()
{
    input();
    if (n == 1) {
        cout << arr[1];
    }
    else if (n == 2) {
        cout << arr[1] + arr[2];
    }
    else if (n == 3) {
        cout << std::max(std::max(arr[1] + arr[3], arr[2] + arr[3]), arr[1] + arr[2]);
    }
    else {
        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];
        dp[3] = std::max(std::max(arr[1] + arr[3], arr[2] + arr[3]), arr[1] + arr[2]);
        for (int i = 4; i <= n; i++) {
            dp[i] = std::max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
            dp[i] = std::max(dp[i], dp[i - 1]);
        }
        cout << dp[n];
    }
    return 0;
}


