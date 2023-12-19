

/*

653. Two Sum IV - Input is a BST
        Easy
        6.5K
        256
        Companies
        Given the root of a binary search tree and an integer k, return true if there exist two elements in the BST such that their sum is equal to k, or false otherwise.

        Example 1:
        Input: root = [5,3,6,2,4,null,7], k = 9
        Output: true

        Example 2:
        Input: root = [5,3,6,2,4,null,7], k = 28
        Output: false


 */







package Trees.BST.Easy;

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

class TwoSum{

    static boolean findTarget(TreeNode root, int k) {
        List<Integer>ls = new ArrayList<>();

        inorderTraversal(root,ls);

        for(int i=0;i<ls.size();i++){
            for(int j=i+1;j<ls.size();j++){
                if(ls.get(i)+ls.get(j) == k){
                    return true;
                }
            }
        }

        return false;
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


