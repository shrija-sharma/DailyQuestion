import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BinaryTreeNode<T>
     {
         T data;
         BinaryTreeNode<T> left;
         BinaryTreeNode<T> right;

         BinaryTreeNode(T data) {
             this.data = data;
             left = null;
             right = null;
         }
     };

public class LeftViewofBinaryTree1 {
  public static void leftView(TreeNode<Integer> root, List<Integer> res) {
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
      int n = q.size();
      for (int i = 0; i < n; i++) {
        TreeNode<Integer> curr = q.poll();
        if (i == n - 1) {
          res.add(curr.data);
        }
        if (curr.right != null) {
          q.add(curr.right);
        }
        if (curr.left != null) {
          q.add(curr.left);
        }
      }
    }
  }

  public static void printLeftView(TreeNode<Integer> root) {
    List<Integer> res = new ArrayList<>();
    leftView(root, res);
    for (int val : res) {
      System.out.print(val + " ");
    }
  }
}
