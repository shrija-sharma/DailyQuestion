public class MissingNumber {
      public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int totalsum=n*(n+1)/2;
        int ans=totalsum-sum;
        return ans;
    }
}
