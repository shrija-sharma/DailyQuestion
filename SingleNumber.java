public class SingleNumber {
      public int singleNumber(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}
