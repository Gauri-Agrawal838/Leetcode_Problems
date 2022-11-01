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
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        dfs(root, low, high);
        return sum;
    }
    public void dfs(TreeNode node, int left, int right)
    {
        if(node!=null)
        {
            if(left<=node.val && node.val<=right)
                sum = sum + node.val;
            if(left<node.val)
                dfs(node.left, left, right);
            if(node.val<right)
                dfs(node.right, left, right);
        }
    }
}