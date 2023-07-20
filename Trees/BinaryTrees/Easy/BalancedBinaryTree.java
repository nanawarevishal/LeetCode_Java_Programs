
/*
 110. Balanced Binary Tree
        Easy
        9.4K
        535
        Companies
        Given a binary tree, determine if it is 
        height-balanced
        .

        

        Example 1:
        Input: root = [3,9,20,null,null,15,7]
        Output: true

        Example 2:
        Input: root = [1,2,2,3,3,null,null,4,4]
        Output: false

        Example 3:
        Input: root = []
        Output: true

 */



package Trees.BinaryTrees.Easy;

import javax.print.FlavorException;

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

public class BalancedBinaryTree {
    static  boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }

        int height = heightBT(root);

        if(height==-1){
            return false;
        }

        return true;

    }

    static int heightBT(TreeNode root){
        if(root==null){
            return 0;
        }

        int left = heightBT(root.left);
        int right = heightBT(root.right);

        if(left== -1 || right==-1){
            return -1;
        }

        if(Math.abs(left-right)>1){
            return -1;
        }

        return 1+Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left =new TreeNode(4);
        root.left.left.right =new TreeNode(4);

        System.out.println(isBalanced(root));
    }
}
