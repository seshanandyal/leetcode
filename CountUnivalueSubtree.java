/**
 * Given a binary tree, count the number of uni-value subtrees. 
 * A Uni-value subtree means all nodes of the subtree have the same value.
 * 
 * @author Sesha Nandyal
 */

package com.veda.binarytree;

public class CountUnivalueSubtree {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	private int mCount = 0;
    public int countUnivalSubtrees(TreeNode root) {
        if(root == null) return mCount;
        
        getSubtreeVal(root);
        return mCount;
    }
    
    int getSubtreeVal(TreeNode root) {
        if(root.left == null && root.right == null) {
            mCount++;
            return root.val;
        }
        int leftSubtreeValue = root.left == null ? root.val : getSubtreeVal(root.left);
        int rightSubtreeValue = root.right == null ? root.val : getSubtreeVal(root.right);
        
        if(leftSubtreeValue == rightSubtreeValue && leftSubtreeValue == root.val) {
            mCount++;
            return root.val;
        } else return Integer.MAX_VALUE;
        
    }
}
