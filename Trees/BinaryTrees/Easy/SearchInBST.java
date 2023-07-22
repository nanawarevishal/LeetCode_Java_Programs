

/*

 700. Search in a Binary Search Tree
        Easy
        5.2K
        171
        Companies
        You are given the root of a binary search tree (BST) and an integer val.

        Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

        

        Example 1:
        Input: root = [4,2,7,1,3], val = 2
        Output: [2,1,3]


        Example 2:
        Input: root = [4,2,7,1,3], val = 5
        Output: []


 */



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
 

public class SearchInBST {

    static TreeNode searchBST(TreeNode root, int val) {

        if(root==null){
            return null;
        }

        TreeNode temp = null;

        Queue<TreeNode>queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int queueSize = queue.size();
            System.out.println(queueSize);

            for(int i=0;i<queueSize;i++){
                if(queue.peek().left!=null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.add(queue.peek().right);
                }
                
                if(val == queue.peek().val){
                    temp =  queue.peek();
                    return temp;
                }
                queue.poll();
            }
        }
        return temp;
        
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode node  = searchBST(root, 5);

        // System.out.println(node.val);
    }
}
