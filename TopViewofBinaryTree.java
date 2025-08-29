import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

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

class Pair {
  TreeNode node;
  int line;

  Pair(TreeNode node, int line) {
    this.node = node;
    this.line = line;
  }
}

public class TopViewofBinaryTree {
  public static List<Integer> getTopView(TreeNode root) {
    // Write your code here.
    List<Integer> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    Queue<Pair> q = new LinkedList<Pair>();
    Map<Integer, Integer> map = new TreeMap<>();

    q.add(new Pair(root, 0));

    while (!q.isEmpty()) {
      Pair it = q.remove();
      int line = it.line;
      TreeNode node = it.node;
      if (map.get(line) == null)
        map.put(line, node.data);

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
