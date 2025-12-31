package Array;
import java.util.*;
public class Largest {
    public static int largest_num(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int arrs[]={3,5,6,7};
        System.out.print(largest_num(arrs));
    }
}
