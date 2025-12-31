package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 -newNode next=head
        newNode.next = head; // link

        // step3 - head= newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // to add between the linkedlist
    public void add(int ind, int data) {
        if (ind == 0) {
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < ind - 1) {
            temp = temp.next;
            i++;
        }
        // i= ind-1 ; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    // this is remove function
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linkedlist is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // to remove the last element
    public int removeLast() {
        if (size == 0) {
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // to search an element
    public int itrsearch(int valu) {
        Node prev = head;
        int i = 0;
        while (prev != null) {
            if (prev.data == valu) {
                return i;
            }
            prev = prev.next;
            i++;
        }
        return -1;
    }

    // to search the element using recursion
    public int helper(Node data, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeFromLast(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next;
            return;
        }
        // sz-n
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){//helper
        Node slow = head;
        Node fast= head;

        while(fast != null && fast.next !=null){
            slow=slow.next;// +1
            fast =fast.next.next;//+2
        }
        return slow;//slow is my midNode
    }
    public boolean isPalindrom(){
        if(head==null || head.next==null){
            return true;
        }
        // step1 - reverse find mid
        Node midNode = findMid(head);

        // step2 - reverse  2nd half
        Node prev =null;
        Node curr =midNode;
        Node next;
        while(curr != null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        Node right= prev;
        Node left= head;
        // check if equal
        while(right !=null){
            if(left.data != right.data){
                return false;
            }
            left =left.next;
            right= right.next;
        }
        return true;
    }

    // public static Node findmid(Node heaNode){
    //     Node slow=head;
    //     Node fast=head.next;

    //     while(fast!=null && fast.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }
    //     return slow;
    // }
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
        Node mid=findMid(head);
        // left & right
        Node rightHead = mid.next;
        mid.next=null;
        Node newLeft= mergeSort(head);
        Node newRight= mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);

    }

    public void zigZag(){
        // find mid
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node mid=slow;

        // reverse 2nd half
        Node curr =mid.next;
        mid.next= null;
        Node prev= null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left= head;
        Node right=prev;
        Node nextL, nextR;

        // alternate merge - zig-zag merge
        while(left !=null && right !=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            
            left=nextL;
            right= nextR;
        }
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // ll.print();
        // ll.add(2, 4);
        ll.print();  
        ll.zigZag();
        // System.out.print(ll.mergeSort(ll.head));
        ll.print();
        // ll.reverse();
        // ll.removeFromLast(3);
        // is remove from 1st is also possible
        // ll.print();
        // System.out.println(ll.isPalindrom());
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // System.out.println(ll.itrsearch(8));
        // System.out.println(ll.recSearch(8));
        // System.out.println("size= "+ll.size);
    }
}
