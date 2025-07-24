import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public record DFSofGraph() {
  // Function to return a list containing the DFS traversal of the graph.
  public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
    // Code here
    ArrayList<Integer> ans = new ArrayList<>();
    Stack<Integer> st = new Stack<>();
    boolean[] visited = new boolean[adj.size()];

    st.push(0);

    while (!st.isEmpty()) {
      int node = st.pop();
      if (!visited[node]) {
        visited[node] = true;
        ans.add(node);
        List<Integer> neighbors = adj.get(node);
        for (int i = neighbors.size() - 1; i >= 0; i--) {
          int neighbor = neighbors.get(i);
          if (!visited[neighbor]) {
            // visited[neighbor]=true;
            st.push(neighbor);
          }
        }
      }
    }
    return ans;
  }
}
