package divide;

public class search_roteted_arr {
    public static int search(int arr[],int target,int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid=(si+ei)/2;
        if(arr[mid]==target){
            return mid;
        }
        // line 1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr,target,si,mid);
            }else{
                return search(arr,target,mid+1,ei);
            }
        }
        // line 2
        else{
            // right side
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr,target,mid+1,ei);
            }
            // left side
            else{
                return search(arr,target,si,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target =0;
        int tarIndex=search(arr,target,0,arr.length-1);
        System.out.println(tarIndex);
        for(int i=0;i<=10;i=i+5){
            for(int j=i+1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
