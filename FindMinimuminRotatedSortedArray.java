public class FindMinimuminRotatedSortedArray {
  public int findMin(int[] nums) {
    int n = nums.length;
    int s = 0, e = n - 1;
    while (s < e) {
      int mid = s + (e - s) / 2;
      if (nums[mid] > nums[e]) {
        s = mid + 1;
      } else {
        e = mid;
      }
    }
    return nums[e];
  }
}
