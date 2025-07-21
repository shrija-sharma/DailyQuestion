import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
  public List<Integer> majorityElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    List<Integer> ans = new ArrayList<>();
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    int occur = n / 3;
    for (var e : map.entrySet()) {
      int key = e.getKey();
      int value = e.getValue();
      if (value > occur) {
        ans.add(key);
      }
    }
    return ans;
  }
}
