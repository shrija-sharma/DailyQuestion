public class FindMaximumInBST {
  public static int findMax(TreeNode root) {
    if (root == null) {
      return -1;
    }
    while (root.right != null) {
      root = root.right;
    }
    return root.val;
  }
}
