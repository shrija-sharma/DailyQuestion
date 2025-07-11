public class SortColors {
      public void sortColors(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1,k=0;
        while(i<=j){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                i++;
                k++;
            }
            if(nums[i]==1){
                i++;
            }
            if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
    }
}
