
/*

1305. All Elements in Two Binary Search Trees
        Medium
        3K
        89
        Companies
        Given two binary search trees root1 and root2, return a list containing all the integers from both trees sorted in ascending order.

        

        Example 1:
        Input: root1 = [2,1,4], root2 = [1,0,3]
        Output: [0,1,1,2,3,4].

        Example 2:
        Input: root1 = [1,null,8], root2 = [8,1]
        Output: [1,1,8,8].


 */




package Trees.BST.Medium;

import java.util.ArrayList;
import java.util.List;

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

class AllElementBST{

    static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>ls1 = new ArrayList<>();
        List<Integer>ls2 = new ArrayList<>();
        List<Integer>ls = new ArrayList<>();

        inorderTraversal(root1,ls1);
        inorderTraversal(root2,ls2);

        int i = 0;
        int j = 0;
        while(i<ls1.size() && j<ls2.size()){

            if(ls1.get(i)<ls2.get(j)){
                ls.add(ls1.get(i));
                i++;
            }

            else{
                ls.add(ls2.get(j));
                j++;
            }
        }

        while(i<ls1.size()){
            ls.add(ls1.get(i));
            i++;
        }

        while(j<ls2.size()){
            ls.add(ls2.get(j));
            j++;
        }

        return ls;
    }

    static void inorderTraversal(TreeNode root,List<Integer>ls){

        if(root == null){
            return;
        }

        inorderTraversal(root.left,ls);
        ls.add(root.val);
        inorderTraversal(root.right,ls);
    }

    public static void main(String[] args) {
        
    }

}