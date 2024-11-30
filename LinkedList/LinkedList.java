public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // Adding at first position
    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // Adding at last position
    public static void addLast(int data){
        Node newnode= new Node(data);
        size++;
        if(head == null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    // Adding the element in the middle of linkedlist
    public static void add(int index,int data){
        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    // Remove first
    public static int removeFirst(){
        if(size==0){
            System.out.print("Linked List is empty");
            return  -1;
        }
        else if (size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    // Remove last
    public static int removeLast(){
        if(size==0){
            System.out.print("Linked List is Empty");
            return -1;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public static int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return  -1;
    }
    // Printing the Linked List
    public static void print(){
        if(head==null){
            System.out.print("Linked List is Empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        LinkedList ll= new LinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(3);
        ll.print();
    }
}