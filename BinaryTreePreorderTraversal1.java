import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal1 {
  public List<Integer> preorderTraversal(TreeNode root) {
    Stack<TreeNode> st = new Stack<>();
    List<Integer> res = new ArrayList<>();

    if (root == null)
      return res;
    st.push(root);
    while (!st.isEmpty()) {
      TreeNode curr = st.pop();
      res.add(curr.val);
      if (curr.right != null) {
        st.push(curr.right);
      }
      if (curr.left != null) {
        st.push(curr.left);
      }
    }
    return res;
  }
}
