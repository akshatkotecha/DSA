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
    private int i=0;
    private HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        i=inorder.length-1;
        return build(postorder,0,inorder.length-1);
    }
    private TreeNode build(int [] postorder,int start,int end){
        if(start>end) return null;
        int val=postorder[i--];
        TreeNode root=new TreeNode(val);
        int idx=map.get(val);
        root.right=build(postorder,idx+1,end);
        root.left=build(postorder,start,idx-1);
        return root;
    }
}