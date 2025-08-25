public class SymmetricTree {
  public boolean SymmetricHelp(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null) {
      return false;
    }
    return left.val == right.val &&
        SymmetricHelp(left.left, right.right) &&
        SymmetricHelp(left.right, right.left);
  }

  public boolean isSymmetric(TreeNode root) {
    return root == null || SymmetricHelp(root.left, root.right);
  }
}
