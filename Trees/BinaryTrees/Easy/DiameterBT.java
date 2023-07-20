

/*

 543. Diameter of Binary Tree
        Easy
        11.9K
        743
        Companies
        Given the root of a binary tree, return the length of the diameter of the tree.

        The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

        The length of a path between two nodes is represented by the number of edges between them.

        

        Example 1:
        Input: root = [1,2,3,4,5]
        Output: 3
        Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

        Example 2:
        Input: root = [1,2]
        Output: 1

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

public class DiameterBT {
    static int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        heightBT(root, diameter);
        return diameter[0]; 
    }

    static int heightBT(TreeNode root , int diameter[]){
        if(root ==null){
            return 0;
        }

        int left = heightBT(root.left, diameter);
        int right = heightBT(root.right, diameter);

        diameter[0] = Math.max(diameter[0],left+right);

        return 1+Math.max(left,right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left .right = new TreeNode(5);


        System.out.println(diameterOfBinaryTree(root));
    }
}
