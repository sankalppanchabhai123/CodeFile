package Array.D_Array;

public class search {
    public static void search(int arr[][], int key){
        // for(int i=0;i<arr.length;i++){
        //     for(int j=arr.length;j>=0;j--){
        //         if(arr[i][arr.length-j]<key){
        //             j--;
        //         }
        //     }
        // }

        int row =0, col=arr[0].length-1;
        // while(row<arr.length && col>=0){
        //     if(arr[row][col]==key){
        //         System.out.print("the element found at key: ("+row+","+col+")");
        //     }
        //     else if(arr[row][col]<key){
        //         if(col==arr[0].length){
        //         col--;
        //         row++;
        //         }
        //         else{
        //             col++;
        //         }
        //     }
        //     else{
        //         row++;
        //     }
        // }
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.print("the element found at key: ("+row+","+col+")");
            }
            else if(arr[row][col]>key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,12,13},
                    {14,15,16,17}            
                    };
        search(arr,10);
    }
}
