package Week_02;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * dfs实现前序遍历
 *
 * @author huangtao
 * @date 2020/8/22
 * @version 1
 */
public class Q144Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		dfs(res,root);
		return res;
	}

	private void dfs(List<Integer> res, TreeNode root) {
		if (root == null) {
			return;
		}
		res.add(root.val);
		dfs(res, root.left);
		dfs(res, root.right);
	}
}
