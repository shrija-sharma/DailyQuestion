import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal {
  public List<Integer> PostOrder(TreeNode root, List<Integer> ans) {
    if (root == null) {
      return ans;
    }
    PostOrder(root.left, ans);
    PostOrder(root.right, ans);
    ans.add(root.val);
    return ans;
  }

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    List<Integer> res = PostOrder(root, ans);
    return res;
  }
}
