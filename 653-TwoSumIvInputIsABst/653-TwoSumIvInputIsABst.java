// Last updated: 19/07/2026, 21:05:07
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

    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, k);
    }

    private boolean dfs(TreeNode node, int k){
        if(node == null){
            return false;
        }

        if(dfs(node.left, k)){
            return true;
        }

        if(set.contains(k-node.val)){
            return true;
        }

        set.add(node.val);
        return dfs(node.right, k);
    }
}