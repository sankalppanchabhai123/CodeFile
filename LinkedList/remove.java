package LinkedList;

import Array.D_Array.search;

public class remove {
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

    public void addFirst(int data){
        // step1 = create new node
        Node newNode = new Node(data);
        if(head== null){
            head=tail=newNode;
            return;
        }
        // step2 -newNode next=head
        newNode.next=head; //link

        // step3 - head= newNode
        head=newNode;
    }

    public int removeFirst(){
        int val= head.data;
        head=head.next;
        return val;
    }

    public void print(){
        if(head==null){
            System.out.println("LL is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        
        System.out.println("Null");
    }

    public static void main(String ars[]){
        LinkedList ll= new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.print();
        ll.removeFirst();
        ll.print();
    }
}
