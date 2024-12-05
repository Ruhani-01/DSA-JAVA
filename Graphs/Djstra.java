
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Djstra {

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

    static class Pair implements Comparable<Pair> {

        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }

    }

    public static void dijstra(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;

            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (vis[curr.n]) {
                vis[curr.n] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;


                    if(dist[u]+wt<dist[v]){
                        dist[u]=dist[u]+wt;
                        pq.add(new Pair(v,dist[v]));
                    }


    
        
        
                
        
                


    
        
            
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}
