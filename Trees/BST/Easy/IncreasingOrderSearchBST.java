

/*

897. Increasing Order Search Tree
        Easy
        4.2K
        665
        Companies
        Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.

        Example 1:
        Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
        Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9].

        Example 2:
        Input: root = [5,1,7]
        Output: [1,null,5,null,7].


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


class IncreasingOrderSearchBST{

    static TreeNode increasingBST(TreeNode root) {
        List<Integer>ls = new ArrayList<>();
        inorderTraversal(root,ls);

        root =new TreeNode(ls.get(0));
        TreeNode temp = root;

        for(int i=1;i<ls.size();i++){
            root.left = null;
            root.right = new TreeNode(ls.get(i));
            root = root.right;
        }

        return temp;
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