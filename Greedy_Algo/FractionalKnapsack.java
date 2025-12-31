package Greedy_Algo;
import java.util.*;

public class FractionalKnapsack {

    public static void main(String args[]){
        int weight[]={10,20,30};
        int val[]={60,100,120};
        double ratio[][]=new double[val.length][2];
        for(int i=0;i<weight.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }

        // ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));


        int capacity=50;
        // int value=0;
        int total=0;
        int n=ratio.length;
        for(int i=n-1;i>=0;i--){
            if(capacity>=weight[i]){
                capacity-=weight[i];
                total+=val[i];
            }else{
                total+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("the final value is: "+total);
    }
}