package BST;
import java.util.*;

public class first {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
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

    public static Node delete(Node root, int val){
        if(root.data<val) root.right = delete(root.right, val);
        if(root.data>val) root.left = delete(root.left, val);
        else{
            // case1-leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            // case 2- single child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            // case3-both children;
            Node Is=findInorderSuccessor(root.right);
            root.data=Is.data;
            root.right=delete(root.right, Is.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root= root.left;
        }
        return root;
    } 

    // print in range
    public static void printInRange(Node root,int num1, int num2){
        if(root==null) return;
        if(root.data>=num1 && root.data<=num2){
            printInRange(root.left, num1, num2);
            System.out.print(root.data+" ");
            printInRange(root.right, num1, num2);
        }
        else if(root.data<num1){
            printInRange(root.left, num1, num2);
            printInRange(root.right, num1, num2);
        }
        else{
            printInRange(root.left, num1, num2);
            printInRange(root.right, num1, num2);
        }
    }

    // print elements from root to leaf
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        printRoot2Leaf(root.left,path);
        printRoot2Leaf(root.right,path);
        
        path.remove(path.size()-1);
    } 
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        // int values[]={5,1,3,4,9,6,8};
        // Node root=null;
        // for(int i=0;i<values.length;i++){
        //     root=insert(root,values[i]);
        // }
        Node root=new Node(10);
        root.left=new Node(8);
        root.right=new Node(20);
        root.left.left=new Node(5);
        root.left.right=new Node(9);
        root.right.left=new Node(12);
        root.right.right=new Node(40);
        // inorder(root);
        // System.out.println();

        // root=delete(root,5);
        // System.out.println();
        // inorder(root);
        // printInRange(root,1,15);
        printRoot2Leaf(root,new ArrayList<>());
    }
}
