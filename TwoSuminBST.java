import java.util.ArrayList;
import java.util.List;

public class TwoSuminBST {
  public List<Integer> inorder(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    helper(root, res);
    return res;
  }

  public void helper(TreeNode root, List<Integer> res) {
    if (root == null) {
      return;
    }
    helper(root.left, res);
    res.add(root.val);
    helper(root.right, res);
  }

  public boolean findTarget(TreeNode root, int k) {
    List<Integer> res = inorder(root);
    int n = res.size();
    int i = 0, j = n - 1;
    while (i < j) {
      int sum = res.get(i) + res.get(j);
      if (sum == k) {
        return true;
      } else if (sum < k) {
        i++;
      } else if (sum > k) {
        j--;
      }
    }
    return false;
  }
}
