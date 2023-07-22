


/*

 107. Binary Tree Level Order Traversal II
        Medium
        4.5K
        312
        Companies
        Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).

        

        Example 1:
        Input: root = [3,9,20,null,null,15,7]
        Output: [[15,7],[9,20],[3]]

        Example 2:
        Input: root = [1]
        Output: [[1]]

        Example 3:
        Input: root = []
        Output: []

 */



package Trees.BinaryTrees.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class BTLevelOrderTraversal_II {

    static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int righDepth = maxDepth(root.right);

        return 1+Math.min(leftDepth,righDepth);
    }

    static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>ls = new ArrayList<>();
        if(root ==null){
            return ls;
        }

        int depth = maxDepth(root);
        System.out.println(depth);

        for(int i=0;i<maxDepth(root);i++){
            ls.add(i, null);
        }


        Queue<TreeNode>queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer>subLs = new LinkedList<>();
            for(int i=0;i<queueSize;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }

                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }

                subLs.add(queue.poll().val);
            }
            ls.add(depth,subLs);
            System.out.println(ls);
        }

        for(int i=0;i<maxDepth(root);i++){
            ls.remove(0);
        }

        return ls;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>>ls = levelOrderBottom(root);

        System.out.println(ls);
    }
}
