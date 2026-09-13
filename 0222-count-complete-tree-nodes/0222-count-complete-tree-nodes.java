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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
       int left=heightleft(root);
       int right=heightright(root);
       if(left==right){
        return (2<<left)-1;
       }
       return 1+countNodes(root.left)+countNodes(root.right);
    }
    int heightleft(TreeNode root){
        TreeNode curr=root;
        int c=0;
        while(curr.left!=null){
            c++;
            curr=curr.left;
        }
        return c;
    }
    int heightright(TreeNode root){
        TreeNode curr=root;
        int c=0;
        while(curr.right!=null){
            c++;
            curr=curr.right;
        }
        return c;
    }

}