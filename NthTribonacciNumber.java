import java.util.Arrays;

public class NthTribonacciNumber {
      public int memo(int n,int[] dp){
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=memo(n-1,dp)+memo(n-2,dp)+memo(n-3,dp);
        return dp[n];
    }
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        return memo(n,dp);
    }
}
