public class BinaryTreeMaximumPathSum {
  int maxi = Integer.MIN_VALUE;

  public int maxPath(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int lefth = Math.max(0, maxPath(root.left));
    int righth = Math.max(0, maxPath(root.right));
    maxi = Math.max(maxi, (root.val + lefth + righth));
    return root.val + Math.max(lefth, righth);
  }

  public int maxPathSum(TreeNode root) {
    maxPath(root);
    return maxi;
  }
}
