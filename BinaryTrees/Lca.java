import java.util.ArrayList;

public class Lca{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node lca(Node root, int n1,int n2){
        ArrayList<Node> path1= new ArrayList<>();
        ArrayList<Node> path2= new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i=0;
        for(;i<path1.size() && i< path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        Node lca= path1.get(i-1);
        return  lca;

    }
    public static boolean getPath(Node root,int n , ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean leftFound=getPath(root.left, n, path);
        boolean rightFound= getPath(root.right, n, path);
        if(leftFound || rightFound){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static void main(String[] args) {
        
    }
}