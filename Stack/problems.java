package Stack;
import java.util.*;
public class problems {
    // valid parenthese
    public static boolean validParen(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            // opening
            if(ch=='[' || ch=='{' || ch=='('){
                s.push(ch);
            }else{ //closing 
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='[' && ch==']') 
                || (s.peek()=='{' && ch=='}')
                || (s.peek()=='(' && ch==')')
                ){
                    s.pop();
                }else{
                    s.push(ch);
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    // duplicate parentheses
    public static boolean duplicateParenthe(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){//closing
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                } 
            }
            else{
                s.push(ch);
            }
        }
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     // closing
        //     if(ch==')'){
        //         int count =0;
        //         while(s.peek()!='('){
        //             s.pop();
        //             count++;
        //         }
        //         if(count<1){
        //             return true;//duplicate
        //         }else{
        //             s.pop();//opening pair
        //         }
        //     }else{
        //         // opening
        //         s.push(ch);
        //     }
        // }
        return false;

    } 
    // Maximum area in Histogram
    public static int maxAreaHostogram(int arr[]){
        // int area=0;
        // for(int i=0;i<arr.length;i++){
        //     int countl=1,countr=0;
        //     int height= arr[i];
        //     for(int j=i;j<arr.length-1;j++){
        //         if(arr[j]<=arr[j+1]){
        //             countl++;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        //     for(int j=i;j>0;j--){
        //         if(arr[j]<=arr[j-1]){
        //             countr++;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        //     int subArea=height*(countl+countr);
        //     area=Math.max(area, subArea);
        // }
        int maxArea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        // next smaller right
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s=new Stack<>();
        for(int i=0; i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        // current area: j-i-1= nsr[i]-nsr[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width= nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea, currArea);
        }
        return maxArea;
    }
    public static void main(String args[]){
        // String str="((a+b)+(a+b))";
        // System.out.print("answer: "+duplicateParenthe(str));
        int heigth[]={2,1,5,6,2,3};
        // int heigth[]={2,1,2};
        System.out.println(maxAreaHostogram(heigth));
    }
}