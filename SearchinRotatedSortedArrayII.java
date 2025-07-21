public class SearchinRotatedSortedArrayII {
      public int pivot(int[] nums,int target){
      int n=nums.length;
        int s=0,e=n-1;
        while(s<e && nums[s]==nums[s+1]){
            s++;;
        }
        while(s<e && nums[e]==nums[e-1]){
            e--;
        }
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[e]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return e;
    }
    public int binarysearch(int[] nums,int target,int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
        }
        return -1;
    }
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int idx=pivot(nums,target);

        int a=binarysearch(nums,target,0,idx-1);
        if(a!=-1){
            return true;
        }
        int b=binarysearch(nums,target,idx,n-1);
        if(b!=-1){
            return true;
        }
        return false;
    }
}
