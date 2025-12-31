package Stack;
import java.util.*;
//...................another method to implement stack from queue.....................

// class MyStack {
//     Queue<Integer> q1 = new LinkedList<>();
//     Queue<Integer> q2 = new LinkedList<>();

//     public void push(int x) {
//         // Always add the new element to q2
//         q2.add(x);
        
//         // Push all elements from q1 to q2
//         while (!q1.isEmpty()) {
//             q2.add(q1.remove());
//         }
        
//         // Swap references of q1 and q2 so q1 contains the stack elements
//         Queue<Integer> temp = q1;
//         q1 = q2;
//         q2 = temp;
//     }

//     public int pop() {
//         if (empty()) {
//             System.out.println("The stack is empty");
//             return -1;  // Return a sentinel value for empty stack
//         }
//         return q1.remove();
//     }

//     public int top() {
//         if (empty()) {
//             System.out.println("The stack is empty");
//             return -1;  // Return a sentinel value for empty stack
//         }
//         return q1.peek();
//     }

//     public boolean empty() {
//         return q1.isEmpty();
//     }

// }

public class QueueToStack {
    static class Stack{
        static Queue<Integer> q1= new LinkedList<>();
        static Queue<Integer> q2= new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data){
            // Time complex= 0(1)
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int pop(){
            // Time complex= 0(1)
            if(isEmpty()){
                System.out.println("empty stack");
            }
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        public static int peek(){
            // Time complex= 0(1)
            if(isEmpty()){
                System.out.println("empty stack");
            }    
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String args[]){
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
