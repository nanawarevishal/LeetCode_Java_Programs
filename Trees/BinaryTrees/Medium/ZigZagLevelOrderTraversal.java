
/*

 103. Binary Tree Zigzag Level Order Traversal
        Medium
        9.6K
        249
        Companies
        Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

        

        Example 1:
        Input: root = [3,9,20,null,null,15,7]
        Output: [[3],[20,9],[15,7]]


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

import javax.management.QueryEval;
import javax.print.attribute.Size2DSyntax;

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

public class ZigZagLevelOrderTraversal {

    static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ls = new ArrayList<>();
        if(root == null){
            return ls;
        }

        Queue<TreeNode>queue = new LinkedList<>();

        queue.offer(root);

        boolean flag = true;
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer>subLs = new ArrayList<Integer>(queueSize);
            for(int i=0;i<queueSize;i++){

               TreeNode root1 = queue.peek();
                queue.poll();

                int ind = (flag) ? i :(queueSize-1-i);

                subLs.add(ind, root1.val);
                    
                if(root1.left!=null){
                    queue.offer(root1.left);
                }

                if(root1.right!=null){
                    queue.offer(root1.right);
                }

            }
            flag = !flag;
            ls.add(subLs);
        }

        return ls;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.left.right = new TreeNode(7);

        List<List<Integer>>ls = zigzagLevelOrder(root);
        System.out.println(ls);
    }
}
