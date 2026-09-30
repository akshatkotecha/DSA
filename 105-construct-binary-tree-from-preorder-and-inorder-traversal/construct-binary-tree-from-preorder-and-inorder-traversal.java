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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Deque<Integer> q=new ArrayDeque<>();
        for(int num : preorder) q.add(num);
        return build(q,inorder);
    }
    private TreeNode build(Deque<Integer> q,int[] inorder){
        if(inorder.length>0){
            int idx=indexOf(inorder,q.poll());
            TreeNode root=new TreeNode(inorder[idx]);
            root.left=build(q,Arrays.copyOfRange(inorder,0,idx));
            root.right=build(q,Arrays.copyOfRange(inorder,idx+1,inorder.length));
            return root;
        }
        return null;
    }
    private int indexOf(int [] nums,int val){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val) return i;
        }
        return -1;
    }
}