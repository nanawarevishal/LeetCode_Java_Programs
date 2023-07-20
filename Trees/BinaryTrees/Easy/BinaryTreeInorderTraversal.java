
/*

 94. Binary Tree Inorder Traversal
        Easy
        11.9K
        611
        Companies
        Given the root of a binary tree, return the inorder traversal of its nodes' values.

        

        Example 1:
        Input: root = [1,null,2,3]
        Output: [1,3,2]

        Example 2:
        Input: root = []
        Output: []

        Example 3:
        Input: root = [1]
        Output: [1]


 */


 // left-->Root-->Right


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
 
public class BinaryTreeInorderTraversal {
    static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer>ls = new ArrayList<>();

        traversal(root, ls);
        return ls;
 
    }

    static void traversal(TreeNode root,List<Integer>ls){
        if(root==null){
            return;
        }

        traversal(root.left, ls);
        ls.add(root.val);
        traversal(root.right, ls);
    } 


    // Using Stack

    static List<Integer>inTraversal(TreeNode root){
        List<Integer>ls = new ArrayList<>();
        if(root==null){
            return ls;
        }

        Stack<TreeNode>st = new Stack<>();
        TreeNode node = root;

        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }

            else{
                if(st.isEmpty()){
                    break;
                }

                node = st.pop();
                ls.add(node.val);
                node = node.right;
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer>ls = inorderTraversal(root);
        // List<Integer>ls = inTraversal(root);

        System.out.println(ls);
    }
}
