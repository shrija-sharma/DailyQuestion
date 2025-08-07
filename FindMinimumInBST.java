import java.util.*;
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
public class FindMinimumInBST {
    public static int findMin(TreeNode root){
        if(root==null){
            return -1;
        }
        while(root.left!=null){
            root=root.left;
        }
        return root.val;
    }
}
