

/*


*******---Incomplete Solution--**********

 987. Vertical Order Traversal of a Binary Tree
        Hard
        6.5K
        4.2K
        Companies
        Given the root of a binary tree, calculate the vertical order traversal of the binary tree.

        For each node at position (row, col), its left and right children will be at positions (row + 1, col - 1) and (row + 1, col + 1) respectively. The root of the tree is at (0, 0).

        The vertical order traversal of a binary tree is a list of top-to-bottom orderings for each column index starting from the leftmost column and ending on the rightmost column. There may be multiple nodes in the same row and same column. In such a case, sort these nodes by their values.

        Return the vertical order traversal of the binary tree.

        

        Example 1:
        Input: root = [3,9,20,null,null,15,7]
        Output: [[9],[3,15],[20],[7]]
        Explanation:
        Column -1: Only node 9 is in this column.
        Column 0: Nodes 3 and 15 are in this column in that order from top to bottom.
        Column 1: Only node 20 is in this column.
        Column 2: Only node 7 is in this column.


        Example 2:
        Input: root = [1,2,3,4,5,6,7]
        Output: [[4],[2],[1,5,6],[3],[7]]
        Explanation:
        Column -2: Only node 4 is in this column.
        Column -1: Only node 2 is in this column.
        Column 0: Nodes 1, 5, and 6 are in this column.
                1 is at the top, so it comes first.
                5 and 6 are at the same position (2, 0), so we order them by their value, 5 before 6.
        Column 1: Only node 3 is in this column.
        Column 2: Only node 7 is in this column.


        Example 3:
        Input: root = [1,2,3,4,6,5,7]
        Output: [[4],[2],[1,5,6],[3],[7]]
        Explanation:
        This case is the exact same as example 2, but with nodes 5 and 6 swapped.
        Note that the solution remains the same since 5 and 6 are in the same location and should be ordered by their values.


 */


package Trees.BinaryTrees.Hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;


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

class Pair{
    TreeNode node;
    int line;

    Pair(TreeNode _node,int _line){
        line = _line;
        node = _node;
    }
}
 

public class verticalOrderTraversal {

    static List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>ls = new ArrayList<>();

        if(root == null){
            return ls;
        }

        Map<Integer,Integer>mp = new TreeMap<>();
        Queue<Pair>queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        while(!queue.isEmpty()){
            int queueSize = queue.size();
            Pair temp = queue.remove();
            int line = temp.line;
            TreeNode node = temp.node;

            for(int i=0;i<queueSize;i++){

                mp.put(line, node.val);
    
                if(node.left!=null){
                    queue.offer(new Pair(node.left, line-1));
                }
    
                if(node.right!=null){
                    queue.offer(new Pair(node.right, line=1));
                }

            }


        }

        System.out.println(mp);

        return ls;
        
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>>ls = verticalTraversal(root);
        System.out.println(ls);
    }
}
