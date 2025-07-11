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
public class SerachinBST {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null && root.val!=val){
            if(root.val>val){
                root=root.left;
            }
            else if(root.val<val){
                root=root.right;
            }
        }
        return root;
    }
}
