public class DiameterofBinaryTree {
  int dia = 0;

  public int diameter(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int lefth = diameter(root.left);
    int righth = diameter(root.right);
    dia = Math.max(dia, lefth + righth);
    return Math.max(lefth, righth) + 1;
  }

  public int diameterOfBinaryTree(TreeNode root) {
    diameter(root);
    return dia;
  }
}
