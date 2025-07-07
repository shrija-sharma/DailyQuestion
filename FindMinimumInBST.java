import java.util.*;
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
