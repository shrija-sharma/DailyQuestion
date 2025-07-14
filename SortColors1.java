public class SortColors1 {
      public void sortColors(int[] nums) {
        int n=nums.length;
        int zerocount=0,onecount=0,twocount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zerocount++;
            }
            else if(nums[i]==1){
                onecount++;
            }
            else if(nums[i]==2){
                twocount++;
            }
        }
        int i=0;
        while(zerocount!=0){
            nums[i]=0;
            i++;
            zerocount--;
        }
        while(onecount!=0){
            nums[i]=1;
            onecount--;
            i++;
        }
        while(twocount!=0){
            nums[i]=2;
            twocount--;
            i++;
        }
    }
}