
import java.util.ArrayList;
public class Binary{
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
    public static Node insert(Node root,int val){
        if(root==null){
            
            return new Node(val);
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }
        else if(root.data<val){
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    // Deleting a node in BST 
        public static Node findinOrderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right, val);
        }
        else if(root.data>val){
            root.left=delete(root.left, val);
        }
        else{
            // Single Child
            if(root.left==null && root.right == null){
                return null;
            }
            // One child
            if(root.left==null){
                return root.right;
            }

            if(root.right== null){
                return root.left;
            }

            // 2 childs 
            Node LS=findinOrderSuccessor(root.right);
            root.data=LS.data;
            root.right=delete(root.right, LS.data);   
        }
        return  root;
    }
    // Search in a BST
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }
    // Printing in a range
    public static void printInRange(Node root, int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if (root.data>k1) {
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    // All root to leaf paths 
    public static void print2leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right== null){
            print(path);
        }
        print2leaf(root.left, path);
        print2leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void print(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            path.get(i);
        }
    }
    // Is validate BST
    public static boolean isValidBSt(Node root,Node min, Node max){
        if(root==null){
            return  true;
        }
        if(min!=null && root.data<=min.data){
            return  false;
    }
    else if (max!=null && root.data >= max.data){
        return false;
    }
     return isValidBSt(root.left, min, max) && isValidBSt(root.right, min, max);
    }
    // Mirror the BST 
    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror=createMirror(root.left);
        Node rightMirror= createMirror(root.right);
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }
    public static void main(String[] args) {
        Node root=null;
        int nodes[]={5,2,4,1,3,7};
        for(int i=0;i<nodes.length;i++){
            root=insert(root, nodes[i]);
        }
        inOrder(root);
        printInRange(root, 3, 5);
    }
    
}