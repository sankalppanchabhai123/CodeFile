package Queue.Deque;

import java.util.*;

public class inbuild {
    public static void main(String ars[]){
        Deque<Integer> deque= new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addFirst(5);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println("first el= "+deque.getFirst());
        System.out.println("Last el= "+deque.getLast());
    }
}
