import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int partner=target-nums[i];
            if(map.containsKey(partner)){
                return new int[]{map.get(partner),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
