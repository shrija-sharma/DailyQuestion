import java.util.*;
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(var e:map.entrySet()){
            int freq=e.getValue();
            int key=e.getKey();
            if(freq>n/2){
                return key;
            }
        }
        return -1;
    }
}
