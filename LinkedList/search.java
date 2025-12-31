package LinkedList;

public class search {
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

    
    public int itrsearch(int valu){
        Node prev= head;
        int i=0;
        while(prev!=null){
            if(prev.data==valu){
                return i;
            }
            prev= prev.next;
            i++;
        }
        return -1;
    }

    public void addLast(int data){
        Node newNode =new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail= newNode;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addLast(5);
        ll.addLast(8);
        ll.addLast(6);
        ll.addLast(9);
        ll.addLast(1);
        ll.addLast(3);
        // System.out.println(ll.itrsearch(9));
    }
}
