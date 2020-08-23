package Week_02;


import Util.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * bfs前序遍历
 * @author huangtao
 * @date 2020/8/23
 * @version 2
 */
public class Q589SolutionV2 {
	public List<Integer> preorder(Node root) {
		List<Integer> res = new ArrayList<>();

		Deque<Node> stack = new ArrayDeque<>();
		Node tmp = root;
		while (tmp != null || !stack.isEmpty()) {
			while (tmp != null) {
				res.add(tmp.val);
				int size = tmp.children.size();
				if (size == 0) {
					tmp = null;
					break;
				}
				for (int i = size-1; i >= 1; i--) {
					stack.push(tmp.children.get(i));
				}
				tmp = tmp.children.get(0);
			}
			if (!stack.isEmpty()) {
				tmp = stack.pop();
			}
		}
		return res;
	}

}
