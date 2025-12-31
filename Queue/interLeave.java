package Queue;

import java.util.*;

public class interLeave {
    public static void interLeave(Queue<Integer> q){
        Queue<Integer> firstHalf= new LinkedList<>();
        int size =q.size();

        for(int i=0;i<size/2;i++){
            firstHalf.add(q.remove());
        }

        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    // Queue Reversal

    public static void reversal(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
           q.add(st.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        reversal(q);
        // interLeave(q);
        // Queue<Integer> temp=q;
        // while(!temp.isEmpty()){
        //     q.add(q.remove());
        // }
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
