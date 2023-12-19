
/*

669. Trim a Binary Search Tree
        Medium
        5.7K
        250
        Companies
        Given the root of a binary search tree and the lowest and highest boundaries as low and high, trim the tree so that all its elements lies in [low, high]. Trimming the tree should not change the relative structure of the elements that will remain in the tree (i.e., any node's descendant should remain a descendant). It can be proven that there is a unique answer.

        Return the root of the trimmed binary search tree. Note that the root may change depending on the given bounds.

        

        Example 1:
        Input: root = [1,0,2], low = 1, high = 2
        Output: [1,null,2].

        Example 2:
        Input: root = [3,0,4,null,2,null,null,1], low = 1, high = 3
        Output: [3,2,null,1].


 */


package Trees.BST.Medium;

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

class TrimBST{

    static TreeNode trimBST(TreeNode root, int low, int high) {
        List<Integer>ls = new ArrayList<>();
        inorderTraversal(root,ls,low,high);

        for(int i=0;i<ls.size();i++){
            root = deleteNode(root,ls.get(i));
        }
        return root;
    }

    static TreeNode deleteNode(TreeNode root,int key){

        if(root == null){
            return root;
        }

        if(root.val == key){
            return helper(root);
        }

        TreeNode temp = root;

        while(root!=null){

            if(root.val>key){
                if(root.left!=null && root.left.val == key){
                    root.left = helper(root.left);
                }

                else{
                    root = root.left;
                }
            }

            else{
                if(root.right!=null && root.right.val == key){
                    root.right = helper(root.right);

                }

                else{
                    root = root.right;
                }
            }
        }

        return temp;
    }

    static TreeNode helper(TreeNode root){

        if(root.left == null){
            return root.right;
        }

        if(root.right == null){
            return root.left;
        }

        TreeNode rightChild = root.right;
        TreeNode lastRightChild = findRightChild(root.left);

        lastRightChild.right = rightChild;

        return root.left;
    }

    static TreeNode findRightChild(TreeNode root){
        if(root.right == null){
            return root;
        }

        return findRightChild(root.right);
    } 

    static void inorderTraversal(TreeNode root,List<Integer>ls,int low,int high){
        if(root == null){
            return;
        }

        inorderTraversal(root.left,ls,low,high);
        if(root.val<low || root.val>high){
            ls.add(root.val);
        }

        inorderTraversal(root.right,ls,low,high);
    }

    public static void main(String[] args) {
        
    }
}
