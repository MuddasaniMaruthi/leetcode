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
    int c=0;
    public int countDominantNodes(TreeNode root) {
        count(root);
        return c;
    }
     int count(TreeNode root){
            if(root==null){
                return 0;
            }
            int left=count(root.left);
            int right=count(root.right);
            if(root.val>=left&&root.val>=right){
                c++;
            }
           
         return Math.max(root.val, Math.max(left, right));
        }
    
}