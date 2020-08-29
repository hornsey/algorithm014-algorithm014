package Week_03;


import Util.TreeNode;

/**
 * 递归实现
 *
 * @author huangtao
 * @date 2020/8/26
 */
public class Q236Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left != null && right != null) {
			return root;
		} else if (left != null) {
			return left;
		} else {
			return right;
		}
	}

}
