
import java.util.ArrayList;

public class printAllpath {

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

    public static void printAllpath(ArrayList<Edge> graph[], int src, int dest, String path) {
        if (src == dest) {
            System.out.print(path);
            return;
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printAllpath(graph,e.dest, dest, path+src);
        }
    

    

    public static void main(String[] args) {

    }
}
