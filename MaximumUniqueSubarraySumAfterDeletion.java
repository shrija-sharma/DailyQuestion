import java.util.HashSet;

public class MaximumUniqueSubarraySumAfterDeletion {
      public int maxSum(int[] nums) {
        int n=nums.length;
        int ans=0;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){ 
            if(num<0){
                num=0;
            }
            set.add(num);
        }
        for(int num:set){
            ans+=num;
        }
        if(ans<=0){
            for(int num:nums){
                max=Math.max(max,num);
            }
            return max;
        }
        return ans;
    }
}
