package Greedy_Algo;
import java.util.*;

public class MinCoinsFinding {
    public static void main(String args[]){
        int coins[]={2000,100,500,50,10,20,200,5,2,1};
        int value=250;
        int count=0;
        Arrays.sort(coins,Comparator.reverseOrder());
        ArrayList<Integer>() ans= new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(value=>coins[i]){
                while(coins[i]<value){
                    value-=coins[i];
                    ans.add(coins[i]);
                    count++;
                }
            }
        } 
        System.out.println("total (min) coins used= "+count);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans.get());
        }
    }
}
