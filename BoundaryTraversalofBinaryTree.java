import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversalofBinaryTree {
   class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }
  public static boolean isleaf(TreeNode root) {
    if (root.left == null && root.right == null) {
      return true;
    }
    return false;
  }

  public static void leftBoundary(TreeNode root, List<Integer> ans) {
    TreeNode curr = root.left;
    while (curr != null) {
      if (isleaf(curr) == false)
        ans.add(curr.data);
      if (curr.left != null) {
        curr = curr.left;
      } else {
        curr = curr.right;
      }
    }
  }

  public static void addLeaves(TreeNode root, List<Integer> ans) {
    if (isleaf(root) == true) {
      ans.add(root.data);
      return;
    }
    if (root.left != null)
      addLeaves(root.left, ans);
    if (root.right != null)
      addLeaves(root.right, ans);
  }

  public static void rightBoundary(TreeNode root, List<Integer> ans) {
    TreeNode curr = root.right;
    List<Integer> temp = new ArrayList<>();

    while (curr != null) {
      if (isleaf(curr) == false)
        temp.add(curr.data);
      if (curr.right != null) {
        curr = curr.right;
      } else {
        curr = curr.left;
      }
    }
    for (int i = temp.size() - 1; i >= 0; i--) {
      ans.add(temp.get(i));
    }
  }

  public static List<Integer> traverseBoundary(TreeNode root) {
    // Write your code here.
    List<Integer> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    if (isleaf(root) == false)
      res.add(root.data);
    leftBoundary(root, res);
    addLeaves(root, res);
    rightBoundary(root, res);
    return res;
  }
}
