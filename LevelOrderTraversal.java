/**
 * Level order traversal
 * @author Sesha Nandyal
 */

package com.veda.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> listOfList = new ArrayList<>();
		if (root == null)
			return listOfList;

		levelOrderTraversal(root, listOfList);
		return listOfList;
	}

	private void levelOrderTraversal(TreeNode node, List<List<Integer>> listOfList) {
		// node has already been checked to be not null - we are not rechecking here.
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);

		List<Integer> list = null;
		while (!queue.isEmpty()) {
			int size = queue.size();
			list = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode tempNode = queue.remove();
				list.add(tempNode.val);
				if (tempNode.left != null)
					queue.add(tempNode.left);
				if (tempNode.right != null)
					queue.add(tempNode.right);
			}
			listOfList.add(list);
		}
		return;
	}
}