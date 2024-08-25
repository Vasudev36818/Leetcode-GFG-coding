/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
        list = find(list,root);

        return list;
        
    }

    public List<Integer> find(List<Integer> list,TreeNode root){
        if(root==null) return list;
            find(list,root.left);
            find(list,root.right);
            list.add(root.val);
        return list;
    }
}