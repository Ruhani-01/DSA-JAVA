public class klevel{
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
    public static void klevel(Node root, int level,int k ){
        if(root==null){
            return;
        }
        if(level ==k){
            System.out.print(root.data+" ");
        }
        klevel(root.left, level+1, k);
        klevel(root.right, level+1, k);
    }
    public static void main(String[] args) {
        
    }
}