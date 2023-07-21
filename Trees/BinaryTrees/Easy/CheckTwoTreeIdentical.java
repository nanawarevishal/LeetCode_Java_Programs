
/*

 100. Same Tree
        Easy
        9.9K
        194
        Companies
        Given the roots of two binary trees p and q, write a function to check if they are the same or not.

        Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

        

        Example 1:
        Input: p = [1,2,3], q = [1,2,3]
        Output: true

        Example 2:
        Input: p = [1,2], q = [1,null,2]
        Output: false

        Example 3:
        Input: p = [1,2,1], q = [1,1,2]
        Output: false

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
public class CheckTwoTreeIdentical {

    static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null){
            return true;
        }

        else if (p == null || q == null){
            return false;
        }

        return ((p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));

    }


    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(5);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.right.left = new TreeNode(4);

        System.out.println(isSameTree(root1, root2));

    }
}
