import java.util.HashSet;

public class MaximumErasureVlue {
      public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        HashSet<Integer> st=new HashSet<>();
        int sum=0;
        int l=0;
        int max=0;
        for(int r=0;r<n;r++){
            if(!st.contains(nums[r])){
                st.add(nums[r]);
                sum+=nums[r];
            }
            else if(st.contains(nums[r])){
                while(nums[l]!=nums[r]){
                    st.remove(nums[l]);
                    sum-=nums[l];
                    l++;
                }
                l++;
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}
