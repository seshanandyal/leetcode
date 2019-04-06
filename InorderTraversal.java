/**
 * Inorder traversal of a binary tree
 *  @author Sesha Nandyal
 */

package com.veda.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;

		inorder(root, list);
		return list;
	}

	private void inorder(TreeNode node, List<Integer> list) {
		if (node == null)
			return;

		inorder(node.left, list);
		list.add(node.val);
		inorderIterative(node.right, list);
	}

	private void inorderIterative(TreeNode node, List<Integer> list) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = node;
		while (true) {
			if (current == null) {
				if (stack.isEmpty())
					return;
				current = stack.pop();
				list.add(current.val);
				current = current.right;
			} else {
				stack.push(current);
				current = current.left;
			}
		}
	}
}
