package Queue;
import java.util.*;

import OOPs.interfaces;
public class inbuild{
    public static void main(String args[]){
    // declaration 
    // Queue<Integer> q=new LinkedList<>();
    Queue<Integer> q= new ArrayDeque<>();
    q.add(1);
    q.add(2);
    q.add(3);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
}
}
