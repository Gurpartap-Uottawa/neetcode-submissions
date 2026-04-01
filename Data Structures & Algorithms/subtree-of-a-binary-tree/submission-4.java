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
    public boolean checkTree(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot==null)
        return true;
        if(root!=null && subRoot!=null && root.val==subRoot.val){
            return checkTree(root.left,subRoot.left) && checkTree(root.right,subRoot.right);
        } else
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
            if(checkTree(curr,subRoot))
            return true;
            else continue;
        }
        return false;
    }
}
