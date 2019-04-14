/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values 
 * along the path equals the given sum.
 * @author Sesha Nandyal
 */

package com.veda.binarytree;

public class PathSum {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null || (root != null && root.left == null && root.right == null && (root.val - sum) != 0))
			return false;

		sum -= root.val;
		if (sum == 0 && root.left == null && root.right == null)
			return true;

		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
	}
}
