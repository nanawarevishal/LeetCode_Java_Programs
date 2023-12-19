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

class SecondMinimumNodeBST{

    static int findSecondMinimumValue(TreeNode root) {

        if(root == null){
            return -1;
        }
        
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        inorderTraversal(root,min,secMin);
        // System.out.println("MIN: "+min);
        // System.out.println("SecMIN: "+secMin);

        return secMin;
    }

    static void inorderTraversal(TreeNode root,int min,int secMin){

        if(root == null){
            return;
        }

       inorderTraversal(root.left,min,secMin);

       if(root.val<min){
           min = root.val;
        //    System.out.println(min);
       }

       else if(root.val!=min && root.val<secMin){
           secMin = root.val;
           System.out.println(secMin);
       }

       inorderTraversal(root.right,min,secMin);
    }   

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);

        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        System.out.println(findSecondMinimumValue(root));
    }
}