

/*

 145. Binary Tree Postorder Traversal
        Easy
        6.2K
        178
        Companies
        Given the root of a binary tree, return the postorder traversal of its nodes' values.

        

        Example 1:
        Input: root = [1,null,2,3]
        Output: [3,2,1]


        Example 2:
        Input: root = []
        Output: []

        Example 3:
        Input: root = [1]
        Output: [1]


 */


// left-->Right-->Root



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
 
public class BinaryTreePostOrderTraversal {
    static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer>ls = new ArrayList<>();

        traversal(root, ls);
        return ls;
 
    }

    static void traversal(TreeNode root,List<Integer>ls){
        if(root==null){
            return;
        }

        traversal(root.left, ls);
        traversal(root.right, ls);
        ls.add(root.val);
    } 

    static List<Integer> postTraversal(TreeNode root){
        List<Integer>ls = new ArrayList<>();

        if(root==null){
            return ls;
        }

        Stack<TreeNode>st = new Stack<>();

        return ls;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer>ls = preorderTraversal(root);

        System.out.println(ls);
    }
}
