package Binary_Tree;
import java.util.*;
// import javax.management.InstanceNotFoundException;

// import Binary_Tree.Height.Binarytree;

public class Height {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Tree{
        public static int count(Node root){
            if(root==null){
                return 0;
            }
            int lc= count(root.left);
            int rc= count(root.right);
            return lc+rc+1;
        }
        public static int sum(Node root){
            if(root==null){
                return 0;
            }
            int lc= sum(root.left);
            int rc= sum(root.right);
            return lc+rc+root.data;
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh= height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }
        public static int diameter(Node root){ //0(n^2)
            if(root==null){
                return 0;
            }
            int leftDiam=diameter(root.left);
            int leftHt=height(root.left);
            int rightDiam=diameter(root.right);
            int rightHt=height(root.right);

            int selfDiam=leftHt + rightHt +1;
            return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
        }
    static class Info{
        int diam;
        int height;
        public Info(int diam,int height){
            this.diam=diam;
            this.height=height;
        }
    }
    public static Info optimalDiam(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info rightInfo=optimalDiam(root.right);
        Info leftInfo=optimalDiam(root.left);

        int diam =Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.height+rightInfo.height+1);
        int ht= Math.max(leftInfo.height,rightInfo.height)+1;

        return new Info(diam,ht);
    }
}
    public static void main(String args[]){
        Tree tree=new Tree();
        Node root=new Node(10);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(2);
        root.left.right=new Node(4);
        root.right.left=new Node(20);
        root.right.right=new Node(40);

        // System.out.println(tree.count(root));
        // System.out.println(tree.sum(root));
        System.out.println(tree.optimalDiam(root).diam);
        // System.out.println(tree.diameter(root));
        // System.out.println(tree.diameter(root));
        // System.out.println(tree.diameter(root));
        // System.out.println(tree.Apro2Diameter(root));
    }
}
