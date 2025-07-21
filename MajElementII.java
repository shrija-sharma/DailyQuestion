import java.util.ArrayList;
import java.util.List;

public class MajElementII {
      public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int cnt1=0,cnt2=0;
        int candidate1=0,candidate2=0;
        for(int i=0;i<n;i++){
            if(candidate1==nums[i]){
                cnt1++;
            }
            else if(candidate2==nums[i]){
                cnt2++;
            }
            else if(cnt1==0){
                candidate1=nums[i];
                cnt1++;
            }
            else if(cnt2==0){
                candidate2=nums[i];
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int num:nums){
            if(num==candidate1){
                cnt1++;
            }
            else if(num==candidate2){
                cnt2++;
            }
        }
        if(cnt1>n/3){
            ans.add(candidate1);
        }
        if(cnt2>n/3){
            ans.add(candidate2);
        }
        return ans;
    }
}
