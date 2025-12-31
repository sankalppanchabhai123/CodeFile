package ArrayList;

import java.util.ArrayList;

public class water_contain {
    // brute force approach  Time complexity =0(n^2)
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

    // optimize whith time complexity =0(n);
    public static int storeWater2(ArrayList<Integer> height){
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;

        while(lp < rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width= rp-lp;
            int currWater=ht*width;
            maxwater= Math.max(maxwater,currWater);
            // update ptr
            if(height.get(lp)< height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
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
        // storeWater(height);
        System.out.print(storeWater2(height));
    }
}
