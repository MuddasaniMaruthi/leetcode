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
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        Queue<Integer>queue1=new LinkedList<>();
        int pro=10;
        
        int sum=0;
        queue.offer(root);
        queue1.offer(root.val);
        while(!queue.isEmpty()){
            int ls=queue.size();
            for(int i=0;i<ls;i++){
                TreeNode curr=queue.poll();
                int ans=queue1.poll();
                int sol=ans*10;
                if(curr.left==null&&curr.right==null){
                    list.add(ans);
                }
                if(curr.left!=null){
                    queue.offer(curr.left);
                    queue1.offer(sol+curr.left.val);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                    queue1.offer(sol+curr.right.val);
                }
            }

        }
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}