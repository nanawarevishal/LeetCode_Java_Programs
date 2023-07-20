
/*


 124. Binary Tree Maximum Path Sum
        Hard
        14.9K
        662
        Companies
        A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

        The path sum of a path is the sum of the node's values in the path.

        Given the root of a binary tree, return the maximum path sum of any non-empty path.

        

        Example 1:
        Input: root = [1,2,3]
        Output: 6
        Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.


        Example 2:
        Input: root = [-10,9,20,null,null,15,7]
        Output: 42
        Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.


 */


package Trees.BinaryTrees.Hard;


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

public class BinaryTreeMaximumPathSum {

    static int maxPathSum(TreeNode root) {
        int maxPathSum[] = new int[1];
        maxPathSum[0] = Integer.MIN_VALUE;
        maxPathSumBT(root, maxPathSum);

        return maxPathSum[0];
    }

    static int maxPathSumBT(TreeNode root,int maxSum[]){
       if(root == null){
            return 0;
       }

       int leftSum =Math.max(0,maxPathSumBT(root.left,maxSum));
       int rightSum = Math.max(0,maxPathSumBT(root.right,maxSum));
       maxSum[0] = Math.max(maxSum[0],leftSum+rightSum+root.val);

       return root.val+Math.max(leftSum,rightSum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(-1);
        // root.right = new TreeNode(20);
        // root.right.left = new TreeNode(15);
        // root.right.right = new TreeNode(7);

        System.out.println(maxPathSum(root));
    }
}
