package Recursion;

public class Practice {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static StringBuilder findIndexes(int n,int arr[],int key,StringBuilder count){
        if(n<arr.length){
            if(arr[n]==key){
                count.append(n+" ");
            }
            return findIndexes(n+1, arr, key,count);
        }
        return count;
    }
    public static void convertNum(int num){
        if(num==0){
            return;
        }
        int lastDigit= num%10;
        convertNum(num/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static int lengthStr(String str) {
        if(str.length()==0){
            return 0;
        }
        return lengthStr(str.substring(1))+1;
    }

    public static int countSubString(String str,int si,int ei,int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int res=countSubString(str, si+1, ei, n-1) +
                countSubString(str, si, ei-1, n-1) -
                countSubString(str, si+1, ei-1, n-2);
        if(str.charAt(si)==str.charAt(ei)){
            res++;
        }
        return res;
    }
    public static void main(String args[]){
        // int arr[]={2,3,2,5,6,2};
        int num=1234;
        String str="sankalp";
        String str2="abcab";
        
        System.out.println(countSubString(str2,0, str2.length()-1,str2.length()));
        // System.out.println(lengthStr(str));
        // static StringBuilder count = new StringBuilder();
        // convertNum(num);
        
        // System.out.print(findIndexes(0,arr,2,new StringBuilder("")));
    }
}
