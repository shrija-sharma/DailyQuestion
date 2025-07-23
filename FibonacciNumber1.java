import java.util.Arrays;

public class FibonacciNumber1 {
      public int memo(int[] dp,int n){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=memo(dp,n-1)+memo(dp,n-2);
        return dp[n];
    }
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        return memo(dp,n);
    }
}
