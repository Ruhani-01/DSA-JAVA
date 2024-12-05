
import java.util.ArrayList;
import java.util.Stack;


public class Topological {

    static class Edge {

        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortutil(graph,i,vis,s);
            }
        }

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void topSortutil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s ){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].size();
            if(!vis[e.dest]){
                topSortutil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);


    }
    public static void main(String[] args) {

    }
}
