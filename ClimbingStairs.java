import java.util.Arrays;

public class ClimbingStairs {
      public int memo(int n,int[] dp){
        if(n==0){
            return 1;
        }       
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=memo(n-1,dp)+memo(n-2,dp);
        return dp[n];
    }
        public int climbStairs(int n) {
            int[] dp=new int[n+1];
            Arrays.fill(dp,-1);
            dp[0]=1;
            dp[1]=1;
            return memo(n,dp);
    }
}
