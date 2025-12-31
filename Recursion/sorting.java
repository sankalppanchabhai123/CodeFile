package Recursion;

public class sorting {
    public static int optimizePower(int n,int pow){
        if(pow==0){
            return 1;
        }
        int halfPower=optimizePower(n, pow/2);
        int halfPowerSq= halfPower*halfPower;
        
        // condition when the power is odd
        if(n%2!=0){
            halfPowerSq= n*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static int power(int num, int pow){
        if(pow==0){
            return 1;
        }
        int value = num*power(num, pow-1);
        return value;
    }
    public static int findindex(int arr[], int key ,int i){
        // if(arr[i]==key){
        //     return i;
        // }
        // if(i<=0){
        //     // System.out.println("key is not found");
        //     return -1;
        // }
        // return findindex(arr, key, i-1);
        if(i== arr.length){
            return -1;
        }
        int isFound= findindex(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static boolean sorting(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorting(arr, i+1);
        // if(arr[i]>=arr[i+1]){
        //     sorting(arr, i+1);
        // }
        // if(i>arr.length){
        //     return;
        // }
        // else{
        //     int temp =arr[i];
        //     arr[i]=arr[i+1];
        //     arr[i+1]=temp;
        // }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,9,9,0,2};
        // System.out.print(sorting(arr, 0));
        // System.out.println(findindex(arr,9,0));
        // System.out.println(power(2, 3));
        System.out.println(optimizePower(2, 10));
}
}