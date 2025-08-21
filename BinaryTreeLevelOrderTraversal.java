import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();

    if (root == null) {
      return ans;
    }
    q.add(root);
    while (!q.isEmpty()) {
      int n = q.size();
      List<Integer> li = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        TreeNode curr = q.poll();
        li.add(curr.val);
        if (curr.left != null) {
          q.add(curr.left);
        }
        if (curr.right != null) {
          q.add(curr.right);
        }
      }
      ans.add(li);
    }
    return ans;
  }
}
