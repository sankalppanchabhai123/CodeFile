package Array;
import java.util.*;
public class Stocks {
    public static int stock_broker(int arr[]){
        int buy_price=Integer.MAX_VALUE;
        int n=arr.length;
        int maxProfit=0;

        for(int i=0;i<n;i++){
            if(buy_price<arr[i]){
                int profit=arr[i]-buy_price;
                maxProfit= Math.max(maxProfit,profit);
            }else{
                buy_price=arr[i];
            }
        };
        return maxProfit;
    }   
    public static void main(String args[]){
        int  arr[]= {7,1,3,4,5,6};
        System.out.println(stock_broker(arr));
    }
}
