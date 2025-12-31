package Sorting;

public class Bubble {
    public static void Bubble(int arr[]){
        int swap=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swap++;
                }
            }
        }
        System.out.println(swap);
    }
//   optimize
    public static void Bubble2(int arr[]){
        int swap=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
      }
        System.out.println(swap);
    }
    // most optimize
    public static void Bubble_opti(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean swap= false;
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        // Bubble(arr);
        // Bubble2(arr);
        Bubble_opti(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
   
