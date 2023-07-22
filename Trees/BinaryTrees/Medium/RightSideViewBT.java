

/*

 199. Binary Tree Right Side View
        Medium
        10.5K
        654
        Companies
        Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

        

        Example 1:
        Input: root = [1,2,3,null,5,null,4]
        Output: [1,3,4]

        Example 2:
        Input: root = [1,null,3]
        Output: [1,3]

        Example 3:
        Input: root = []
        Output: []

 */



package Trees.BinaryTrees.Medium;

import java.util.ArrayList;
import java.util.List;

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

public class RightSideViewBT {

    static List<Integer> rightSideView(TreeNode root) {
        List<Integer>ls = new ArrayList<>();
        if(root==null){
            return ls;
        }

        RightView(root, ls);

        return ls;
    }

    static void RightView(TreeNode root,List<Integer>ls){
        ls.add(root.val);
        if(root.right!=null){
            RightView(root.right, ls);

        }

        else{
            if(root.left!=null){
                RightView(root.left, ls);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        // root.right =new TreeNode(3);
        root.left.right = new TreeNode(5);
        // root.right.right =new TreeNode(4);

        List<Integer>ls = rightSideView(root);

        System.out.println(ls);
    }
}
