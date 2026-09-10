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
    int count=0;
    public int averageOfSubtree(TreeNode root) {
       if(root==null){
        return 0;
       }
       int left=sum(root.left);
       int right=sum(root.right);
       int total=left+right+root.val;
       int nodes=nodes(root);
       int average=total/nodes;
       if(average==root.val){
        count++;
       }
       averageOfSubtree(root.left);
       averageOfSubtree(root.right);
       
        return count;
    }
    static int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=sum(root.left);
        int right=sum(root.right);
        int sum=left+right+root.val;
        return sum;
    }
    static int nodes(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=nodes(root.left);
        int right=nodes(root.right);
        return left+right+1;
    }
}