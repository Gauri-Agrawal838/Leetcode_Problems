/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        if(node==null || node==p || node==q)
            return node;
        TreeNode left = lowestCommonAncestor(node.left,p,q);
        TreeNode right = lowestCommonAncestor(node.right,p,q);
        if(left!=null && right!=null)
            //we have found the lowestCommonAncestor
            return node;
        if(left!=null)
            return left;
        if(right!=null)
            return right;
        return null;
    }
}