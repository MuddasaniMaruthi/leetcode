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
    public int maxLevelSum(TreeNode root) {
        int min=0;
        int max=Integer.MIN_VALUE;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        int level=1;
        while(!queue.isEmpty()){
            int sum=0;
            int ls=queue.size();
            for(int i=0;i<ls;i++){
                TreeNode curr=queue.poll();
                sum+=curr.val;
                if(curr.left!=null){
                    queue.offer(curr.left);

                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            if(sum>max){
                max=sum;
                min=level;
            }
            level++;
        }
        return min;
    }
}