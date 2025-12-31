package BST;

public class VallidBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean isVallidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        } 
        if(min != null && root.data<=min.data){
            return false;
        }
        if(max != null && root.data>=max.data){
            return false;
        }
        return isVallidBST(root.left, min, root) && isVallidBST(root.right,root,max);
    }
    // here we create one mirror image of BST
    // time complexity = 0(n);
    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror=createMirror(root.left);
        Node rightMirror=createMirror(root.right);
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    } 
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static Node ArrayToBST2(int nodes[],int str,int end){
        if(str>end){
           return null;
        }
        int mid=(str+end)/2;
        Node root=new Node(nodes[mid]);
        root.left=ArrayToBST2(nodes,str,mid-1);
        root.right=ArrayToBST2(nodes,mid+1,end);
        return root; 
    } 
    // for the largest BST
    static class Info{
        boolean isBST;
        int size;
        int min,max;
        Info(boolean isbst,int size,int min, int max){
            this.isBST=isbst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxBST=0;
    public static Info largestBST(Node root){
        if(root==null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo=largestBST(root.left);
        Info rightInfo= largestBST(root.right);
        int size= leftInfo.size + rightInfo.size+1;
        int min=Math.min(root.data, Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data, Math.max(leftInfo.max,rightInfo.max));
        
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }
        if(leftInfo.isBST || rightInfo.isBST){
            maxBST =Math.max(maxBST,size);
            return new Info(true, size, min, max);
        }
        return new Info(false,size,min,max);
    }
    public static void main(String args[]){
        // this is the vallid BST
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(60);
        root.left.left=new Node(5);
        root.left.right=new Node(20);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.right=new Node(65);
        root.right.right.left=new Node(80);
        if(isVallidBST(root,null,null)){
            System.out.println("Vallid BST");
        }else{
            System.out.println("Not a Vallid BST");
        }
        // inorder(root);
        // System.out.println();
        // createMirror(root);
        // inorder(root);
        int arr[]={3,5,6,8,10,11,12};
        // Node root=ArrayToBST2(arr, 0, arr.length-1);
        // Node root=new Node(1);
        // inorder(root);

        Info info=largestBST(root);
        System.out.println("largest BST size= "+maxBST);
    }
}