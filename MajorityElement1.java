public class MajorityElement1 {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0,candidate=0;
        for(int num:nums){
            if(cnt==0){
                candidate=num;
                cnt++;
            }
            else if(num==candidate){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return candidate;
    }
}
