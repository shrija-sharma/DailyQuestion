import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZagLevelOrderTraversal {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    ArrayList<List<Integer>> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    boolean leftToright = true;
    q.add(root);
    while (!q.isEmpty()) {
      int n = q.size();
      LinkedList<Integer> li = new LinkedList<>();
      for (int i = 0; i < n; i++) {
        TreeNode curr = q.poll();
        if (leftToright) {
          li.addLast(curr.val);
        } else {
          li.addFirst(curr.val);
        }
        if (curr.left != null) {
          q.add(curr.left);
        }
        if (curr.right != null) {
          q.add(curr.right);
        }
      }
      leftToright = !leftToright;
      res.add(li);
    }
    return res;
  }
}
