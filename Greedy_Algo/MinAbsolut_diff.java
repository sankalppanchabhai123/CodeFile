package Greedy_Algo;
import java.util.*;

public class MinAbsolut_diff {
    public static void main(String args[]){
        int A[]={1,7,5}; //1,4,7,8
        int B[]={2,3,5}; //2,3,5,6
        Arrays.sort(A);
        Arrays.sort(B);
        int count=0;
        for(int i=0;i<A.length;i++){
            count+= Math.abs(A[i]-B[i]);
            // int ans=A[i]-B[i];
            // if(ans<0){
            //     count+=-ans;
            // }else{
            //     count+=ans;
            // }
        }
        System.out.println(count);
    }
}
