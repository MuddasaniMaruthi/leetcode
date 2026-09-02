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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        int level=0;
        while(!queue.isEmpty()){
            int ls=queue.size();
            int el=0;
            int ol=Integer.MAX_VALUE;
            for(int i=0;i<ls;i++){
                TreeNode curr=queue.poll();
                if(level%2==0){
                    
                    if(curr.val<=el||curr.val%2==0){
                      return false;
                    }
                    if(curr.left!=null){
                        queue.offer(curr.left);
                    }
                    if(curr.right!=null){
                        queue.offer(curr.right);
                    }
                    el=curr.val;
                }
                else{
                    if(curr.val>=ol||curr.val%2!=0){
                        return false;
                    }
                    if(curr.left!=null){
                        queue.offer(curr.left);
                    }
                    if(curr.right!=null){
                        queue.offer(curr.right);
                    }
                    ol=curr.val;
                }
                
            }
            level++;
        }
        return true;
    }
}