package Week_03;

import Util.TreeNode;

import java.util.*;

/**
 * 存储所有值的父节点，然后查找公共父节点
 *
 * @author huangtao
 * @date 2020/8/29
 * @version 2
 */
public class Q236SolutionV2 {
	Map<Integer, TreeNode> parents = new HashMap<>();
	Set<Integer> visited = new HashSet<>();
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		dfs(root);
		while (p != null) {
			visited.add(p.val);
			p = parents.get(p.val);
		}
		while (q != null) {
			if (visited.contains(q.val)) {
				return q;
			}
			q = parents.get(q.val);
		}
		return null;
	}

	private void dfs(TreeNode root) {
		if (root.left != null) {
			parents.put(root.left.val, root);
			dfs(root.left);
		}
		if (root.right != null) {
			parents.put(root.right.val, root);
			dfs(root.right);
		}
	}
}
