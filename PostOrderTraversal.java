/**
 * Postorder traversal
 * @Author Sesha Nandyal
*/

package com.veda.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
	class TreeNode {
		int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        
        //postorder(root, list);
        postorderIterative(root, list);
        return list;
    }
    
    void postorder(TreeNode node, List<Integer> list) {
        if(node == null) return;
        postorder(node.left, list);
        postorder(node.right, list);
        list.add(node.val);
    }
    
    void postorderIterative(TreeNode root, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(true) {
            if(current == null) {
                if(stack.isEmpty()) break;
        
                if(stack.peek().right == null) {
                    TreeNode node = stack.pop();
                    list.add(node.val);
                    while(!stack.isEmpty() && stack.peek().right == node) {
                        node = stack.pop();
                        list.add(node.val);
                    }
                } else current = stack.peek().right;
            } else {
                stack.push(current);
                current = current.left;
            }
        }
    }
}
