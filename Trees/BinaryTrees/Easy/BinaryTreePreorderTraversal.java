

/* 

 144. Binary Tree Preorder Traversal
        Easy
        7.1K
        185
        Companies
        Given the root of a binary tree, return the preorder traversal of its nodes' values.

        

        Example 1:
        Input: root = [1,null,2,3]
        Output: [1,2,3]


        Example 2:
        Input: root = []
        Output: []

        Example 3:
        Input: root = [1]
        Output: [1]

 */



package Trees.BinaryTrees.Easy;

import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
 
public class BinaryTreePreorderTraversal {
    static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer>ls = new ArrayList<>();

        traversal(root, ls);
        return ls;
 
    }

    static void traversal(TreeNode root,List<Integer>ls){
        if(root==null){
            return;
        }

        ls.add(root.val);
        traversal(root.left, ls);
        traversal(root.right, ls);
    } 


    //Using stack without recursion

    static List<Integer> preTraversal(TreeNode root){
        List<Integer>ls = new ArrayList<>();

        if(root==null){
            return ls;
        }

        Stack<TreeNode>st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            root = st.pop();

            ls.add(root.val);

            if(root.right!=null){
                st.push(root.right);
            }

            if(root.left!=null){
                st.push(root.left);
            }

        }

        return ls;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // List<Integer>ls = preorderTraversal(root);
        List<Integer>ls = preTraversal(root);

        System.out.println(ls);
    }
}
