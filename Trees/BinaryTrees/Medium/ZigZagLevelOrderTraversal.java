
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

public class ZigZagLevelOrderTraversal {

    static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ls = new LinkedList<>();
		Queue<TreeNode>queue = new LinkedList<>();
		if(root==null){
			return ls;
		}

		queue.offer(root);
        int height = 1;
		while(!queue.isEmpty()){
			int queueSize = queue.size();
			List<Integer>subls = new LinkedList<>();
			List<Integer>subls1 = new LinkedList<>();

			for(int i=0;i<queueSize;i++){
				if(queue.peek().left!=null){
					queue.offer(queue.peek().left);
				}

				if(queue.peek().right!=null){
					queue.offer(queue.peek().right);
				}
				subls.add(queue.poll().val);
                

			}
            if(height%2==0){
                
                for(int j=subls.size()-1;j>=0;j--){
                    subls1.add(subls.get(j));
                }
                ls.add(subls1);
            }
            else{
                ls.add(subls);
            }
            height++;
		}

		return ls;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>>ls = zigzagLevelOrder(root);
        System.out.println(ls);
    }
}
