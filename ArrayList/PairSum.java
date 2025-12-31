package ArrayList;
import java.util.*;

public class PairSum {
    // brute force approach
    public static  boolean pairsum(ArrayList<Integer> list, int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }return false;
    }
    // But this method is use only when the arraylist is sorted
    public static boolean optimize(ArrayList<Integer> list, int target){
        int lp=0, rp=list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        height.add(7);
        height.add(8);
        height.add(9);
        int target=10;
       System.out.println(optimize(height, target));
    //    System.out.println(pairsum(height, target));
    }
}
