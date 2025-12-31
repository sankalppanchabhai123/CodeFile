package LinkedList;
// import java.util.LinkedList;
public class MergeSort_LL {
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

    public  void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            newNode=head=tail;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static Node print(){
        if(head==null){
            return head;
        }
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        return null;
    }
    public static Node findmid(Node heaNode){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergedLL= new Node(-1);
        Node temp = mergedLL;

        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next= head1;
                head1= head1.next;
                temp =temp.next;
            }else{
                temp.next=head2;
                head2= head2.next;
                temp= temp.next;
            }
        }
        while(head1!=null){
            temp.next= head1;
            head1= head1.next;
            temp =temp.next;
        }
        while(head2!=null){
            temp.next= head2;
            head2= head2.next;
            temp =temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        // base case
        if(head==null || head.next==null){
            return head; 
        }
        // find mid
        Node mid=findmid(head);
        // left & right
        Node rightHead = mid.next;
        mid.next=null;
        Node newLeft= mergeSort(head);
        Node newRight= mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);

    }

    public static void main(String args[]){
        // LinkedList<Integer> ll= new LinkedList<>();
        LinkedList ll=new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        
        ll.print();
        // ll.head= ll.mergeSort(ll.head);
        ll.mergeSort(ll.head);
        ll.print();
        // 0(nlog(n))

        // merge(ll);
    }
}
