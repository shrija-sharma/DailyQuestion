import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSofGraph {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[adj.size()];
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int currnode=q.poll();
            ans.add(currnode);
            for(int i:adj.get(currnode)){
                if(!visited[i]){
                    q.add(i);
                    visited[i]=true;
                }     
            }
        }
        return ans;
    }
}
