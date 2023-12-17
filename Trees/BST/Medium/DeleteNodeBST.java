

/*

450. Delete Node in a BST
        Medium
        8.6K
        236
        Companies
        Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

        Basically, the deletion can be divided into two stages:

        Search for a node to remove.
        If the node is found, delete the node.
        

        Example 1:
        Input: root = [5,3,6,2,4,null,7], key = 3
        Output: [5,4,6,2,null,null,7]
        Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
        One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
        Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.

        Example 2:
        Input: root = [5,3,6,2,4,null,7], key = 0
        Output: [5,3,6,2,4,null,7]
        Explanation: The tree does not contain a node with value = 0.

        Example 3:
        Input: root = [], key = 0
        Output: [].


 */




package Trees.BST.Medium;

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

class DeleteNodeBST{

    static TreeNode deleteNode(TreeNode root,int key){

        if(root == null){
            return root;
        }

        if(root.val == key){
            return helper(root);
        }

        TreeNode temp = root;

        return temp;


    }

    static TreeNode helper(TreeNode root){

        if(root.left == null){
            return root.right;
        }

        if(root.right == null){
            return root.left;
        }

        TreeNode rightChild = root.right;
        TreeNode lastRightChild = findRightChild(root.left);
        lastRightChild.right = rightChild;

        return root.left;
    }

    static TreeNode findRightChild(TreeNode root){

        if(root.right == null){
            return root;
        }

        return findRightChild(root.right);
    }

    public static void main(String[] args) {
        
    }
}