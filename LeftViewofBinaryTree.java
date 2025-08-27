import java.util.ArrayList;
import java.util.List;

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

public class LeftViewofBinaryTree {
      public static void leftView(TreeNode<Integer> root,List<Integer> ans,int level){
        if(root==null){
            return;
        }
        if(level==ans.size()){
            ans.add(root.data);
        }
        leftView(root.left,ans,level+1);
        leftView(root.right,ans,level+1);
    }
    public static void printLeftView(TreeNode<Integer> root) {
        // Write your code here.
        List<Integer> ans=new ArrayList<>();
        leftView(root,ans,0);
        for(int val:ans){
            System.out.print(val+" ");
        }
    }
}
