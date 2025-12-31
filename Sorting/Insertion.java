package Sorting;

import java.util.*;

public class Insertion {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr= arr[i];
            int prev=i-1;
            
            while(prev>=0 && arr[prev]>arr[curr]){
                arr[prev+1]= arr[prev];
                prev--;
            }
             arr[prev+1]=curr;
        }
    }

        public static void countingSort(int arr[]){
            int largest= Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                largest=Math.max(largest, arr[i]);
            }
            int count[]=new int[largest+1];
            for(int i=0;i<arr.length;i++){
                count[arr[i]]++;
            }
            // sorting
            int j=0;
            for(int i=0; i<count.length;i++){
                while(count[i]>0){
                    arr[j]=i;
                    j++;
                    count[j]--;
                }
            }
        }
    public static void main(String args[]){
        int arr[]={7,4,3,2,1};
        // insertion(arr);
        countingSort(arr);
        // Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
