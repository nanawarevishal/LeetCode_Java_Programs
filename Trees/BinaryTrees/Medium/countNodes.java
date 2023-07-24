

/*

 222. Count Complete Tree Nodes
        Medium
        7.7K
        417
        Companies
        Given the root of a complete binary tree, return the number of the nodes in the tree.

        According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

        Design an algorithm that runs in less than O(n) time complexity.

        

        Example 1:
        Input: root = [1,2,3,4,5,6]
        Output: 6


        Example 2:
        Input: root = []
        Output: 0


        Example 3:
        Input: root = [1]
        Output: 1


 */


package Trees.BinaryTrees.Medium;

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

public class countNodes {

    static int countNode(TreeNode root) {
        int nodeCount[] = new int[1];

        inOrderTraversal(root, nodeCount);

        return nodeCount[0];
    }

    static void inOrderTraversal(TreeNode root,int countNodes[]){
        if(root == null){
            return;
        }

        countNodes[0]++;
        inOrderTraversal(root.left, countNodes);
        inOrderTraversal(root.right, countNodes);

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println(countNode(root));
    }
}
