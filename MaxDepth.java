/**
 * Max depth of a binary tree
 * @author Sesha Nandyal
 */

package com.veda.binarytree;

public class MaxDepth {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	 
	public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root == null) return depth;
        
        return maxDepth(root, depth);
    }
    
    private int maxDepth(TreeNode node, int depth) {
        if(node == null) return depth;
        int leftDepth = maxDepth(node.left, depth + 1);
        int rightDepth = maxDepth(node.right, depth + 1);
        
        return Math.max(leftDepth, rightDepth);
    }
	
}
