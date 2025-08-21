import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversal {
  public List<Integer> preorder(TreeNode root, List<Integer> ans) {
    if (root == null) {
      return ans;
    }
    ans.add(root.val);
    preorder(root.left, ans);
    preorder(root.right, ans);
    return ans;
  }

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> ans = new ArrayList<Integer>();
    List<Integer> res = preorder(root, ans);
    return res;
  }
}
