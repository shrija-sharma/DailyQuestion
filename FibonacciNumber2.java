import java.util.Arrays;
public class FibonacciNumber2 {
  public int tabulation(int[] dp, int n) {
    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }

  public int fib(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int[] dp = new int[n + 1];
    Arrays.fill(dp, -1);
    dp[0] = 0;
    dp[1] = 1;
    return tabulation(dp, n);
  }
}
