public class DelelteNodeinBST {
  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) {
      return null;
    }
    TreeNode dummy = root;
    if (root.val == key) {
      return helper(root);
    }
    while (root != null) {
      if (root.val > key) {
        if (root.left != null && root.left.val == key) {
          root.left = helper(root.left);
        } else {
          root = root.left;
        }
      } else {
        if (root.right != null && root.right.val == key) {
          root.right = helper(root.right);
        } else {
          root = root.right;
        }
      }
    }
    return dummy;
  }

  public TreeNode helper(TreeNode root) {
    if (root.left == null) {
      return root.right;
    }
    if (root.right == null) {
      return root.left;
    }
    TreeNode rightchild = root.right;
    TreeNode left = findlastright(root.left);
    left.right = rightchild;
    return root.left;
  }

  public TreeNode findlastright(TreeNode root) {
    while (root.right != null) {
      root = root.right;
    }
    return root;
  }
}
