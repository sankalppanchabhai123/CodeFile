package Stack;

import java.util.Stack;

public class induild {
    // this function is to add at the first position of the stack
    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    // function to reverse the string using stack
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        str = result.toString();
        return str;
    }

    public static void optimalReverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        optimalReverse(s);
        pushBottom(s, top);

    }

    // public static void rev_Stack(Stack<Integer> s){
    // Stack<Integer> newS= new Stack<>();
    // while(!s.isEmpty()){
    // int curr= s.pop();
    // newS.push(curr);
    // }
    // while(!newS.isEmpty()){
    // int curr=newS.pop();
    // System.out.println(curr);
    // }
    // }
    // function is to print the stack
    public static void print(Stack<Integer> s) {
        while (!s.isEmpty()) {
            int curr = s.pop();
            System.out.println(curr);
        }
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        // rev_Stack(s);
        optimalReverse(s);
        // pushBottom(s,22);
        print(s);

        // String str="abc";
        // String result=revers(str);
        // System.out.println(result);
    }
}
