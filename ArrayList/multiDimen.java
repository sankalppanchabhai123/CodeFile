package ArrayList;

import java.util.ArrayList;

public class multiDimen {
    public static void storeWater(ArrayList<Integer> list){
        int height, width;
        int area=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                height=Math.min(list.get(i), list.get(j));
                width=i-j;
                int temp=height*width;
                area=Math.max(area, temp);
            }
        }
        System.out.println(area);
    }
    public static void main(String args[]){
        // ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2); list.add(9);
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(8); list2.add(5);
        // mainlist.add(list);
        // mainlist.add(list2);
        // System.out.println(mainlist);
        // for(int i=0;i<mainlist.size();i++){
        //     ArrayList<Integer> currlist=mainlist.get(i);
        //     for(int j=0;j<currlist.size();j++){
        //         System.out.print(currlist.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        storeWater(height);
    }
}
