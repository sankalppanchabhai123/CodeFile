package Backtracking;

public class Queen{
    public static boolean isSafe(char arr[][], int row ,int col){
        // vertical
        for(int i=row-1; i>=0; i--){
            if(arr[i][col]=='Q'){
                return false;
            }
        }
        // diagonal left up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--, j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        // diagonal right up
        for(int i=row-1,j=col+1; i>=0 && j<arr.length; i--, j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    
    public static void printArr(char arr[][]){
        System.out.println("----------array possibility----------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void findPossiQueens(char arr[][], int row){
        // base case
        if(row==arr.length){
            printArr(arr);
            return;
        }
        // recursion
        // colomn loop
        for(int j=0;j<arr.length;j++){
            if(isSafe(arr,row,j)){
                arr[row][j]='Q';
                findPossiQueens(arr, row+1); //function call
                arr[row][j]='.';  //backtracking step
            }
        }  
    }
    public static void main(String args[]){
        // ******* time complecxtity of code is 0(n!)        
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        // printArr(arr);
        findPossiQueens(board, 0);
        // printArr(arr);
    }
}