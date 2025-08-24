public class BalancedBinaryTree {
  public int check(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int lefth = check(root.left);
    int righth = check(root.right);
    if (lefth == -1 || righth == -1)
      return -1;
    if (Math.abs(lefth - righth) > 1)
      return -1;
    int height = Math.max(lefth, righth) + 1;
    return height;
  }

  public boolean isBalanced(TreeNode root) {
    return check(root) != -1;
  }
}
