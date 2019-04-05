/**
 * Preordre travesal of a binary tree
 * @author Sesha Nandyal
 */

package com.veda.binarytree;

import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	 	TreeNode(int x) { val = x; }
	}
	
	class Solution {
	    public List<Integer> preorderTraversal(TreeNode root) {
	        List<Integer> list = new ArrayList<>();
	        if(root == null) return list;
	        
	        preorder(root, list);
	        return list;
	    }
	    
	    private void preorder(TreeNode node, List<Integer> list) {
	        if(node == null) return;
	        list.add(node.val);
	        preorder(node.left, list);
	        preorder(node.right, list);
	    }
	    
	    private void preorderIterative(TreeNode node, List<Integer> list) {
	        TreeNode current = node;
	        Stack<TreeNode> stack = new Stack<>();
	        while(true) {
	            if(current == null) {
	                if(stack.isEmpty()) break;
	                current = stack.pop().right;
	            } else {
	                list.add(current.val);
	                stack.push(current);
	                current = current.left;
	            }
	        }
	    }
	}
}
