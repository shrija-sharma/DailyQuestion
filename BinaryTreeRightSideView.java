import java.util.ArrayList;
import java.util.List;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

public class BinaryTreeRightSideView {
  public void rightside(TreeNode root, List<Integer> res, int level) {
    if (root == null) {
      return;
    }
    if (level == res.size()) {
      res.add(root.val);
    }
    rightside(root.right, res, level + 1);
    rightside(root.left, res, level + 1);

  }

  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    rightside(root, res, 0);
    return res;
  }
}
