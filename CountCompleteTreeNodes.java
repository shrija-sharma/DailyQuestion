public class CountCompleteTreeNodes {
  public int countNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = leftHeight(root);
    int right = rightHeight(root);

    if (left == right)
      return (1 << left) - 1;
    return 1 + countNodes(root.left) + countNodes(root.right);
  }

  public int leftHeight(TreeNode root) {
    int cnt = 0;
    while (root != null) {
      cnt++;
      root = root.left;
    }
    return cnt;
  }

  public int rightHeight(TreeNode root) {
    int cnt = 0;
    while (root != null) {
      cnt++;
      root = root.right;
    }
    return cnt;
  }
}
