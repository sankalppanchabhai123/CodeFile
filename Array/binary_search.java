package Array;
import java.util.*;
public class binary_search {

    public static int Binary(int number[], int key){
        int start=0, end= number.length-1;
        while(start <=end){
            int mid=(start+end)/2;
            if(key==number[mid]){
                return mid;
            }
            if(key>number[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args []){
        int number[]= {3,4,5,6,78};
        int key=78;
        System.out.println("the number found at index: "+Binary(number,key));
        System.out.println("The time complexity of Binary search is log(n)");
    }
}
