package Recursion;

public class repeatedCharDel {
    public static void removeDuplicates(String str,int idx, StringBuilder newstr, boolean map[]){
        // int arr2[]={};
        // for(int i=0;i<n;i++){
        //     if(arr[i]==arr2[i]){
        //         // i==i;
        //     }
        // }
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar= str.charAt(idx);
        if(map[currChar - 'a']== true){
            // duplicate
            removeDuplicates(str, idx+1, newstr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currChar), map);
        }
    }
    public static void main(String args[]){
        String str="sasankalllppp";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
