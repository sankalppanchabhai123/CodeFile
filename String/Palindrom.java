package String;
import java.util.*;

public class Palindrom {
    public static boolean palindrom(String str){
        int mid=str.length()/2;
        for(int i=0;i<mid;i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                return true;
            }
        }
        return false;
    }

    // code for Shortest path
    public static float Shortest_path(String str){
        int x_initial=0, y_initial=0, x_final=0, y_final=0;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='W'){
                x_final--;
            }
            else if(str.charAt(i)=='E'){
                x_final++;
            }
            else if(str.charAt(i)=='N'){
                y_final++;
            }
            else{
                y_final--;
            }
        }
        int x =(x_final-x_initial)*(x_final-x_initial);
        int y =(y_final-y_initial)*(y_final-y_initial);
        return (float)Math.sqrt(x+y);
    }
    public static String char_upper_case(String str){
        StringBuilder sb= new StringBuilder("");
        
        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String args[]){
        // String str="WNEENESENNN";
        // System.out.println(palindrom(str));
        // System.out.println(Shortest_path(str));
        String sara="sankalp panchabahi is the";
        System.out.println(char_upper_case(sara));
    }
}
