package Binary_Tree;

import java.util.*;

import OOPs.interfaces;

public class Vertical {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    // vertical tree traversal
    public static void find1(Node root, int pos, int lr[]){
        if(root==null){
            return;
        }
        lr[0] = Math.min(lr[0], pos); // l = lr[0]
        lr[1] = Math.max(lr[1], pos);
        find1(root.left, pos-1, lr);
        find1(root.right, pos+1, lr);
    }
    public static ArrayList<Integer> verticalTrav(Node root){
        int[] lr = new int[]{0, 0}; // lr[0] = l, lr[1] = r
        find1(root, 0, lr);
        int l = lr[0];
        int r = lr[1];
        // positive
        ArrayList<ArrayList<Integer>> positv = new ArrayList<ArrayList<Integer>>(); 
        // negative
        ArrayList<ArrayList<Integer>> negtv=new ArrayList<ArrayList<Integer>>();
        // initialize the array
        for(int i=0;i<=r;i++){
            positv.add(new ArrayList<Integer>());
        }
        for(int i=0;i<=Math.abs(l);i++){
            negtv.add(new ArrayList<Integer>());
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        Queue<Integer> index=new LinkedList<>();
        index.add(0);

        while(!q.isEmpty()){
            Node temp=q.poll();
            int pos=index.poll();
            if(pos>=0){
                positv.get(pos).add(temp.data);
            }else{
                negtv.get(Math.abs(pos)).add(temp.data);
            }
            if(temp.left!=null){
                q.add(temp.left);
                index.add(pos-1);
            }
            if(temp.right!=null){
                q.add(temp.right);
                index.add(pos+1);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i = negtv.size() - 1; i >= 0; i--){
            ans.addAll(negtv.get(i));
        }
        
        for(int i=0;i<positv.size();i++){
            ans.addAll(positv.get(i));
        }
        return ans;
    }

    // diagolan tree traversal

    public static int find2(Node root, int pos){
        if(root==null) return pos;
        int left=find2(root.left, pos+1);
        int right=find2(root.right,pos);
        return Math.max(pos, Math.max(left,right));
    }
    public static void findDig(Node root,int pos,ArrayList<ArrayList<Integer>> ans){
        if(root==null) return;
        ans.get(pos).add(root.data);
        findDig(root.left,pos+1,ans);
        findDig(root.right,pos,ans);
    }
    public static ArrayList<Integer> digonal(Node root){
        int l= find2(root, 0);

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        // initialize ans with empty list
        for(int i=0;i<=l;i++){
            ans.add(new ArrayList<>());
        }
        findDig(root,0,ans);
        ArrayList<Integer> temp =new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                temp.add(ans.get(i).get(j));
            }
        }
        return temp;
    }

    // boundry traversal
    public static void leaf(Node root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            ans.add(root.data);
        }
    }
    public static void nodeLeft(Node root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        ans.add(root.data);
    }
    public static void noderight(Node root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        ans.add(root.data);
    }
    public static void boundryNodes(Node root){
        if(root==null){
            return;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        nodeLeft(root.left,ans);
        leaf(root.left,ans);
        noderight(root.right,ans);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i));
        }
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.left.left=new Node(7);
        root.left.left.right=new Node(8);
        root.left.left.right.left=new Node(11);
        root.left.left.right.right=new Node(12);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.right.right=new Node(10);
        root.right.right.left=new Node(9);
        root.right.right.right.left=new Node(13);
        System.out.println(verticalTrav(root));
        // boundryNodes(root);
        // System.out.println(digonal(root));

    
    }
}

