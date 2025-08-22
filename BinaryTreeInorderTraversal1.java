import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal1 {
  public List<Integer> inorderTraversal(TreeNode root) {
    Stack<TreeNode> st = new Stack<>();
    List<Integer> res = new ArrayList<>();
    if (root == null)
      return res;

    while (true) {
      if (root != null) {
        st.push(root);
        root = root.left;
      } else {
        if (st.isEmpty())
          break;
        root = st.pop();
        res.add(root.val);
        root = root.right;
      }
    }
    return res;
  }
}
