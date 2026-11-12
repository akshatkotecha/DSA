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
    private void dfs(TreeNode root,int sum,int cur,List<List<Integer>> output, List<Integer> list){
        if(root==null) return;
        cur+=root.val;
        list.add(root.val);
        if(root.left==null && root.right==null && cur==sum){
            output.add(new ArrayList<>(list));
        }
        dfs(root.left,sum,cur,output,list);
        dfs(root.right,sum,cur,output,list);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(root,targetSum,0,ans,new ArrayList<>());
        return ans;
    }
}