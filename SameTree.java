public class SameTree {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    if ((p.val == q.val) &&
        isSameTree(p.left, q.left) == true &&
        isSameTree(p.right, q.right) == true) {
      return true;
    }
    return false;
  }
}
