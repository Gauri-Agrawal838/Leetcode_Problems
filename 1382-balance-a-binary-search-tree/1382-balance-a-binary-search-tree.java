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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        inorder(root, list);
        return bbst(list,0,list.size()-1);
    }
    
    void inorder(TreeNode root, ArrayList<TreeNode> list)
    {
        if(root==null)
            return;
        inorder(root.left, list);
        list.add(root);
        inorder(root.right, list);
    }
    
    TreeNode bbst(ArrayList<TreeNode> list, int lefty, int righty)
    {
        if(lefty>righty)
            return null;
        int mid = (lefty+righty)/2;
        TreeNode root = list.get(mid);
        root.left = bbst(list,lefty,mid-1);
        root.right = bbst(list,mid+1,righty);
        return root;
    }
}