public class SearchinRotatedSortedArray1 {
  public int pivot(int[] nums) {
    int s = 0, e = nums.length - 1;
    while (s < e) {
      int mid = s + (e - s) / 2;
      if (nums[mid] > nums[e]) {
        s = mid + 1;
      } else {
        e = mid;
      }
    }
    return e;
  }

  public int BinarySearch(int[] nums, int target, int s, int e) {
    while (s <= e) {
      int mid = s + (e - s) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        s = mid + 1;
      } else if (nums[mid] > target) {
        e = mid - 1;
      }
    }
    return -1;
  }

  public int search(int[] nums, int target) {
    int n = nums.length;
    int pivotidx = pivot(nums);
    int idx = BinarySearch(nums, target, 0, pivotidx - 1);
    if (idx != -1) {
      return idx;
    }
    idx = BinarySearch(nums, target, pivotidx, n - 1);
    return idx;
  }
}
