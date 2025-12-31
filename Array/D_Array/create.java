package Array.D_Array;

import java.util.Scanner;

public class create {
    public static void search(int arr[][],int key){
        int n=arr.length, m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==key){
                    System.out.print("Element found at index: ("+i+","+j+")");
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[][]=new int[3][3];
        int n=arr.length, m=arr[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        search(arr, 9);
    }
}
