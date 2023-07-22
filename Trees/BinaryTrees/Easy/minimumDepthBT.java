

/*


 111. Minimum Depth of Binary Tree
        Easy
        6.7K
        1.2K
        Companies
        Given a binary tree, find its minimum depth.

        The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

        Note: A leaf is a node with no children.

        

        Example 1:
        Input: root = [3,9,20,null,null,15,7]
        Output: 2


        Example 2:
        Input: root = [2,null,3,null,4,null,5,null,6]
        Output: 5


 */


package Trees.BinaryTrees.Easy;


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

public class minimumDepthBT {

    static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int righDepth = minDepth(root.right);

        return 1+Math.min(leftDepth,righDepth);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(minDepth(root));
    }
}
