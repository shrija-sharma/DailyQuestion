public class FindMaximumInBST {
     class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
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
