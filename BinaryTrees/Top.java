
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Top{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static class Info{
         Node node;
         int hd;
         public Info(Node node, int hd){
            this.node= node;
            this.hd=hd;
         }
    }
    public static void Top(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> mp=  new HashMap<>();
        int min=0;
        int max=0;
        q.add(new Info(root,0));
        while(!q.isEmpty()){
            Info curr= q.remove();
            if(!mp.containsKey(curr.hd)){
                mp.put(curr.hd, curr.node);
            }
            if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min=Math.min(min, curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max=Math.max(max, curr.hd+1);
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(mp.get(i).data+" ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Top(root);
    }
}