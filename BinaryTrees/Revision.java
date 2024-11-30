
import java.util.LinkedList;
import java.util.Queue;


public class Revision{
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
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root== null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){
        if(root== null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println("");
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
            public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lht=height(root.left);
            int rht= height(root.right);
            return Math.max(lht, rht)+1;
        }
        public static int count(Node root){
            if(root==null){
                return 0;
            }
            int lt=count(root.left);
            int rt=count(root.right);
            return lt+rt+1;
        }
        public static int sum(Node root){
            if(root==null){
                return 0;
            }
            int lt=sum(root.left);
            int rt=sum(root.right);
            return lt+rt+root.data;
        }
        // public static int diameter(Node root){ // Finding the diameter in O(n^2)
        //     if(root==null){
        //         return 0;
        //     }
        //     int ld=diameter(root.left);
        //     int lht=height(root.left);
        //     int rd=diameter(root.right);
        //     int rht=height(root.right);
        //     return Math.max(ld, Math.max(rd, lht+rht+1));
        // }
        static class Info{
            int dia;
            int ht;
            public Info(int dia, int ht){
                this.dia=dia;
                this.ht=ht;
            }
        }
        public static Info diameter(Node root){ // O(N)
            if(root==null){
                return new Info(0,0);
            }
            Info leftInfo=diameter(root.left);
            Info rightInfo=diameter(root.right);
            int diam=Math.max(leftInfo.dia,Math.max(rightInfo.dia, leftInfo.ht+rightInfo.ht+1));
            int high=Math.max(leftInfo.ht, rightInfo.ht)+1;
            return new Info(diam,high);
        }
        



    public static void main(String[] args) {
        // Building a tree 
        Node root= new Node(1);
        root.left=new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);


        System.out.println(diameter(root).dia);
    }
}