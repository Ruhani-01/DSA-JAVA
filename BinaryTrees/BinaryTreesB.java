import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreesB{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return  newNode;
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
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node  root){
            if(root == null){
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
                    if(currNode.left!=null ){
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
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh, rh)+1;
        }
        public static int count(Node root){
            if(root==null){
                return  0;
            }
            int left=count(root.left);
            int right=count(root.right);
            return left+right+1;
        }
        public static int sum(Node root){
            if(root==null){
                return 0;
            }
            int leftSum=sum(root.left);
            int rightSum=sum(root.right);
            return leftSum+rightSum+root.data;
        }
        public static int diameter(Node root){
            if(root == null){
                return  0;
            }
            int leftDiam=diameter(root.left);
            int leftHt=height(root.left);
            int rightDiam=diameter(root.right);
            int rightHt=height(root.right);
            int selfDiam=leftHt+rightHt+1;
            return Math.max(selfDiam,Math.max(leftDiam, rightDiam));
        }
        static class Info{
            int diam;
            int ht;
            public Info(int diam, int ht){
                this.diam=diam;
                this.ht=ht;
            }
        }
        public static Info diameter2(){
            
        }
    }


    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
    }
}