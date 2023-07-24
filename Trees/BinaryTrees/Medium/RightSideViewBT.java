

/*

 199. Binary Tree Right Side View
        Medium
        10.5K
        654
        Companies
        Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

        

        Example 1:
        Input: root = [1,2,3,null,5,null,4]
        Output: [1,3,4]

        Example 2:
        Input: root = [1,null,3]
        Output: [1,3]

        Example 3:
        Input: root = []
        Output: []

 */



package Trees.BinaryTrees.Medium;

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
        node = _node;
        line = _line;
    }
}

public class RightSideViewBT {

    static List<Integer> rightSideViewBruteForce(TreeNode root) {
        List<Integer>ls = new ArrayList<>();
        if(root==null){
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

            mp.put(line, node.val);
            line = line+1;

            for(int i=0;i<queueSize;i++){
                if(node.left!=null){
                    queue.offer(new Pair(node.left, line));
                }

                if(node.right!=null){
                    queue.offer(new Pair(node.right, line));
                }
            }
       }

       for(Map.Entry<Integer,Integer>entry : mp.entrySet()){
            ls.add(entry.getValue());
       }

        return ls;
    }

    static List<Integer> rightSideViewOptimal(TreeNode root){
        List<Integer>ls = new ArrayList<>();
        rightView(root, ls, 0);

        return ls;

    }

    static void rightView(TreeNode root,List<Integer>ls,int level){
        if(root == null){
            return;
        }

        if(level == ls.size()){
            ls.add(root.val);
        }

        if(root.right!=null){
            rightView(root.right, ls, level+1);
        }

        if(root.left!=null){
            rightView(root.left, ls, level+1);
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        // root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right =new TreeNode(4);

        // List<Integer>ls = rightSideViewBruteForce(root);
        List<Integer>ls = rightSideViewOptimal(root);

        System.out.println(ls);
    }
}
