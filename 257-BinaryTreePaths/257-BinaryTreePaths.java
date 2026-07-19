// Last updated: 19/07/2026, 21:06:28
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
    static StringBuilder temp = new StringBuilder();

    static void printme(TreeNode root, ArrayList<String> list) {
        if (root == null) {
            return;
        }

        int length=temp.length();
        temp.append(String.valueOf(root.val + "->"));

        if (root.left == null && root.right == null) {
            list.add(temp.substring(0, temp.length() - 2));
            temp.setLength(length);
            return;
        }
        printme(root.left, list);
        printme(root.right, list);
        temp.setLength(length);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        if (root.left == null && root.right == null) {
            list.add(String.valueOf(root.val));
            return list;
        }
        printme(root, list);
        return list;
    }
}