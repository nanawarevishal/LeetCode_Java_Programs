

/*

938. Range Sum of BST
        Easy
        6.2K
        357
        Companies
        Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].

        

        Example 1:


        Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
        Output: 32
        Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
        Example 2:


        Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
        Output: 23
        Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.

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


class RangeSumBST {

    static int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer>ls = new ArrayList<>();
        inorderTraversal(root,ls);

        int sum = 0;
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)>=low && ls.get(i)<=high){
                sum += ls.get(i);
            }
        }

        return sum;

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