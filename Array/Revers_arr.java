

package Array;
import java.util.*;
public class Revers_arr {
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"); 
            }System.out.println();
        }
    }
    public static void reverse(int arr[]){
        int start=0, end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args []){
        int number[]={2,4,6,8,10} ;
        // reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }System.out.println();
        pairs(number);
    }
}
