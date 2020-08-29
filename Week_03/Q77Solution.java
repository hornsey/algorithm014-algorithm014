package Week_03;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯法
 *
 * @author huangtao
 * @date 2020/8/29
 */
public class Q77Solution {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> ans = new ArrayList<>();
		if (n < 1 || k < 1) {
			return ans;
		}

		helper(ans, n, k, 1, new ArrayList<Integer>());
		return ans;
	}

	private void helper(List<List<Integer>> ans, int n, int k, int index, ArrayList<Integer> list) {
		if (list.size() == k) {
			ans.add(new ArrayList<>(list));
			return;
		}

		int stop = n - (k - list.size())+1;
		for (int i = index; i <= stop; i++) {
			list.add(i);
			helper(ans, n, k, i+1, list);
			list.remove(list.size()-1);
		}
	}
}
