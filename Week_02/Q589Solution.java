package Week_02;


import Util.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * dfs 前序遍历
 *
 * @author huangtao
 * @date 2020/8/23
 */
public class Q589Solution {
	public List<Integer> preorder(Node root) {
		List<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}

		dfs(root, res);
		return res;
	}

	private void dfs(Node root, List<Integer> res) {
		if (root == null) {
			return;
		}
		res.add(root.val);
		for (Node child : root.children) {
			dfs(child, res);
		}
	}
}
