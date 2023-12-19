
/*

230. Kth Smallest Element in a BST
        Medium
        10.9K
        208
        Companies
        Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

        

        Example 1:
        Input: root = [3,1,4,null,2], k = 1
        Output: 1.

        Example 2:
        Input: root = [5,3,6,2,4,null,null,1], k = 3
        Output: 3.


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

class kTHSmallestElement{

    public int kthSmallest(TreeNode root, int k) {
        List<Integer>ls = new ArrayList<>();
        inorderTraversal(root,ls);
        int element = -1;
        for(int i=0;i<ls.size();i++){
           if(i+1 == k){
               element = ls.get(i);
           }
        }

        return element;
    }

   static void inorderTraversal(TreeNode root,List<Integer>ls){

        if(root == null){
            return;
        }

        inorderTraversal(root.left,ls);
        ls.add(root.val);
        inorderTraversal(root.right,ls);
    }

    public static void main(String[] args) {
        
    }
}
