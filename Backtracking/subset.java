package Backtracking;

import java.util.ArrayList;

public class subset {
    public static void Subset(String str,String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.print("null");
            }
            else{System.out.println(ans);}
            return;
        }
        // yes choice
        Subset(str,ans+str.charAt(i),i+1);
        // No choice
        Subset(str, ans, i+1);
    }
    public static void main(String args[]){
        String str="abc";
        Subset(str, "", 0);
        int i=1;
    }
}