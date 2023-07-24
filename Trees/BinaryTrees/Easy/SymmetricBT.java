

/*

 101. Symmetric Tree
        Easy
        13.9K
        317
        Companies
        Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

        

        Example 1:
        Input: root = [1,2,2,3,4,4,3]
        Output: true


        Example 2:
        Input: root = [1,2,2,null,3,null,3]
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
 

public class SymmetricBT {

    static boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }

        return indOrder(root.left, root.right);
        
    }

    static boolean indOrder(TreeNode root1,TreeNode root2){
        if(root1 == null || root2==null){
            return root1==root2;
        }

        if(root1.val!=root2.val){
            return false;
        }

        return indOrder(root1.left, root2.right) && indOrder(root1.right, root2.left);
    }
    public static void main(String[] args) {
        
    }
}
