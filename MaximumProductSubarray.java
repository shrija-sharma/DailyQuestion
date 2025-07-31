public class MaximumProductSubarray {
  class Solution {
    public int maxProduct(int[] nums) {
      int max = Integer.MIN_VALUE;
      int n = nums.length;
      int prod = 1;
      for (int i = 0; i < n; i++) {
        prod *= nums[i];
        max = Math.max(max, prod);
        if (prod == 0) {
          prod = 1;
        }
      }
      prod = 1;
      for (int i = n - 1; i >= 0; i--) {
        prod *= nums[i];
        max = Math.max(max, prod);
        if (prod == 0) {
          prod = 1;
        }
      }
      return max;
    }
  }
}
