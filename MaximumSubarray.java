import java.util.*;
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxi=Math.max(sum,maxi);
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}
