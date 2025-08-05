class TreeNode<T> {
  T data;
  TreeNode<T> left;
  TreeNode<T> right;

  TreeNode(T data) {
    this.data = data;
    left = null;
    right = null;
  }
};

public class CeilinBST {
  public static int findCeil(TreeNode<Integer> node, int x) {

    // Write your code here
    int ceil = -1;
    while (node != null) {
      if (node.data == x) {
        ceil = node.data;
        return ceil;
      }
      if (x < node.data) {
        ceil = node.data;
        node = node.left;
      } else {
        node = node.right;
      }
    }
    return ceil;
  }
}
