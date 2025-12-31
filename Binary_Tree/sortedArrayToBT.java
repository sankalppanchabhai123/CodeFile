package Binary_Tree;

public class sortedArrayToBT {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public TreeNode helper(int nums[],int si, int end){
        if(si>end){
            return null;
        }
        int mid=(end-si)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helper(nums,si,mid-1);
        root.right=helper(nums,mid+1,end);

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    public static void main(String args[]){
        int arr[]={-10,-3,0,5,9};
        sortedArrayToBST(arr);
    }
}

 
