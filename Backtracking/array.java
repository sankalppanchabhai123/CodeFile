package Backtracking;

import java.util.Scanner;
public class array{
    public static void arrayInput(int arr[],int i){
        if(i==arr.length){
            // for(int j=0;j<arr.length;j++){
            //     System.out.println(arr[j]-2);
            // };
            return;
        }
        Scanner sc=new Scanner(System.in);
        arr[i]=sc.nextInt();
        arrayInput(arr, i+1);
        System.out.print(arr[i]-2);
    }
    public static void array_Auto(int arr[],int i,int val){
        if(i==arr.length){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            };
            System.out.println();
            return;
        }
        // recursion
        arr[i]=val;
        array_Auto(arr, i+1,val+1); //fnx call step
        arr[i]=arr[i]-2;// backtracking step
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        // arrayInput(arr,0);
        array_Auto(arr, 0, 1);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        };
    }
}
