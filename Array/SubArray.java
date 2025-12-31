

package Array;
import java.util.*;
public class SubArray {
    // this code is for sub array and its sum
    public static void Sub_sum(int arr[]){
        int ts=0, sum=0, maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.println("total sub array : "+ts);
                    sum += arr[k];
                }System.out.println();
                System.out.println("the Sum ofis:"+sum);
                if(maxSum<sum){
                    maxSum=sum;
                }
                sum=0;
                ts++;
            }System.out.println();
        }System.out.println("total sub array : "+ts);
        System.out.println("maximum sum array : "+maxSum);
    }

    public static void optimal_Sub_sum(int arr[]){
        int ts=0, sum=0, maxSum=Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                sum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                // for(int k=start;k<=end;k++){
                //     System.out.println("total sub array : "+ts);
                //     sum += arr[k];
                // }System.out.println();
                // System.out.println("the Sum ofis:"+sum);
                if(maxSum<sum){
                    maxSum=sum;
                }
                sum=0;
                ts++;
            }
            // System.out.println();
        }System.out.println("total sub array : "+ts);
        System.out.println("maximum sum array : "+maxSum);
    }
    public static void main(String args []){
        int number[]={2,4,6,8,10} ;
        // Sub_sum(number);
        optimal_Sub_sum(number);
    }
}
