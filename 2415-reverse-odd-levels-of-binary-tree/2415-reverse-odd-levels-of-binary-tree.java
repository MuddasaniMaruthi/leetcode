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
    public TreeNode reverseOddLevels(TreeNode root) {
        Deque<TreeNode>queue=new LinkedList<>();
        boolean odd=false;
        queue.offer(root);
        while(!queue.isEmpty()){
            int ls=queue.size();
            ArrayList<TreeNode>list=new ArrayList<>(ls);
            for(int i=0;i<ls;i++){
                TreeNode curr=queue.poll();
                list.add(curr);
                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            if(odd){
                int l=0;
                int r=list.size()-1;
                while(l<=r){
                    int temp=list.get(l).val;
                    list.get(l).val=list.get(r).val;
                    list.get(r).val=temp;
                    l++;
                    r--;
                }
            }
            odd=!odd;
        }
        return root;
    }
}