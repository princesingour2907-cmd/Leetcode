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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) { 
        ArrayList<List<Integer>> ans=new ArrayList<>();
         if(root==null) return ans;
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        int c=0;
        while(!que.isEmpty()){
            int size=que.size();
            ArrayList<Integer> list =new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode num=que.poll();
                list.add(num.val);
                if (num.left!=null) que.offer(num.left);
                if (num.right!=null) que.offer(num.right);
                
            }
            c++;
            if(c%2==0) Collections.reverse(list);
            ans.add(list);
        }
        return ans;
    }
}