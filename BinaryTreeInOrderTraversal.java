import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal {
      public List<Integer> Inorder(TreeNode root,List<Integer> ans){
        if(root==null){
            return ans;
        }
        Inorder(root.left,ans);
        ans.add(root.val);
        Inorder(root.right,ans);
        return ans;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> res=Inorder(root,ans);
        return res;
    }
}
