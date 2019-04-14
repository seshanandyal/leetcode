/**
 * Given a binary tree, checks if it is a symmetric tree.
 * @author Sesha Nandyal
 */

package com.veda.binarytree;

public class SymmetricTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;

		return isSymmetric(root, root);
	}

	private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
		if (leftNode == null && rightNode == null)
			return true;
		if (leftNode == null || rightNode == null)
			return false;

		return (leftNode.val == rightNode.val) && isSymmetric(leftNode.left, rightNode.right)
				&& isSymmetric(leftNode.right, rightNode.left);
	}

}
