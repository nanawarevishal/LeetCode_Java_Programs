
/*

 102. Binary Tree Level Order Traversal
        Medium
        13.7K
        271
        Companies
        Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

        

        Example 1:
        Input: root = [3,9,20,null,null,15,7]
        Output: [[3],[9,20],[15,7]]


        Example 2:
        Input: root = [1]
        Output: [[1]]

        Example 3:
        Input: root = []
        Output: []


 */



package Trees.BinaryTrees.Medium;
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
 
public class BinaryTreeLevelOrderTraversal {

    static List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>>ls = new LinkedList<>();
		Queue<TreeNode>queue = new LinkedList<>();
		if(root==null){
			return ls;
		}

		queue.offer(root);
		while(!queue.isEmpty()){
			int queueSize = queue.size();
			List<Integer>subls = new LinkedList<>();

			for(int i=0;i<queueSize;i++){
				if(queue.peek().left!=null){
					queue.offer(queue.peek().left);
				}

				if(queue.peek().right!=null){
					queue.offer(queue.peek().right);
				}
				subls.add(queue.poll().val);
			}
			ls.add(subls);

		}

		return ls;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>>ls = levelOrder(root);

        System.out.println(ls);

    }
}
