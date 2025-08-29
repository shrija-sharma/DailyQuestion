import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Pair {
  TreeNode node;
  int line;

  Pair(TreeNode node, int line) {
    this.node = node;
    this.line = line;
  }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}

public class BottomViewofBinaryTree {
  public static List<Integer> bottomView(TreeNode root) {
    // Write your code here.
    List<Integer> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    Map<Integer, Integer> map = new TreeMap<>();
    Queue<Pair> q = new LinkedList<Pair>();

    q.add(new Pair(root, 0));

    while (!q.isEmpty()) {
      Pair it = q.remove();
      int line = it.line;
      TreeNode node = it.node;
      map.put(line, node.val);
      if (node.left != null) {
        q.add(new Pair(node.left, line - 1));
      }
      if (node.right != null) {
        q.add(new Pair(node.right, line + 1));
      }
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      res.add(entry.getValue());
    }
    return res;
  }
}
