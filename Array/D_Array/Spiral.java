package Array.D_Array;

public class Spiral {
    public static void spiral(int arr[][]){
        int starRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endCol=arr.length-1;
        while(starRow<=endRow && startCol<=endCol){
            for(int i=startCol;i<=endCol;i++){
                System.out.print(arr[starRow][i]+" ");
            }System.out.println();
            for(int i=starRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }System.out.println();
            for(int i=endCol-1;i>=starRow;i--){
                if(starRow==endRow){
                    break;
                }
                System.out.print(arr[endRow][i]+" ");
            }System.out.println();
            for(int i=endRow-1;i>=starRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }System.out.println();
            starRow++;
            startCol++;
            endCol--;
            endRow--;
        };
    };

    public static int diagonalSum(int arr[][]){
        // This is not optimize code for sum

        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i==j){
        //             sum+=arr[i][j];
        //         }
        //         else if(i+j==arr.length-1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }
        // return(sum);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i !=arr.length-i-1){
                sum+=arr[i][arr.length-1-i];
            }
        }return sum;
    }
    public static void main(String args[]){

        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        // spiral(arr);
        System.out.print(diagonalSum(arr));
    }
}
