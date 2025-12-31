package Binary_Tree;
import java.util.*;

public class Preorder {
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
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            
            return newNode;
        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            preorder(root.left);
            System.out.print(root.data+" ");
            preorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            } 
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data+" ");
        }

        // this is the code for the levelorder triversal
        public static void Levelorder(Node root,int height){
            if(root==null){
                return;
            }

            Queue<Node> q=new LinkedList<>();

            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode= q.remove();
                if(currNode==null){
                    System.out.println();
                    height++;
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
            // System.out.println("the height="+height);
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh= height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }
        public static Node deletLeafNode(Node root,int val){
            if(root==null){
                return null;
            }
            root.left=deletLeafNode(root.left, val);
            root.right=deletLeafNode(root.right, val)
            if(root.data==val){
                return null;
            }
            return root;
        }

    }

    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        // tree.preorder(root);
        // tree.inorder(root);
        tree.Levelorder(root,0);
        System.out.println(tree.height(root));
    }
}
