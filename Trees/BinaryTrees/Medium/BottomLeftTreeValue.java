
/*

513. Find Bottom Left Tree Value
    Medium
    3K
    247
    Companies
    Given the root of a binary tree, return the leftmost value in the last row of the tree.

    

    Example 1:
    Input: root = [2,1,3]
    Output: 1

    Example 2:
    Input: root = [1,2,3,4,null,5,6,null,null,7]
    Output: 7

 */



package Trees.BinaryTrees.Medium;

import java.util.ArrayList;

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

public class BottomLeftTreeValue {

    static int findBottomLeftValue(TreeNode root) {
        ArrayList<Integer>ls = new ArrayList<>();
        leftView(root, ls, 0);
        return ls.get(ls.size()-1);
    }

    static void leftView(TreeNode root,ArrayList<Integer>ls,int level){
        if(root==null){
            return;
        }

        if(ls.size()==level){
            ls.add(root.val);
        }

        if(root.left!=null){
            leftView(root.left, ls, level+1);
        }

        if(root.right!=null){
            leftView(root.right, ls, level+1);
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);

        System.out.println(findBottomLeftValue(root));

    }
}
