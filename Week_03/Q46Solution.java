package Week_03;


import java.util.ArrayList;
import java.util.List;

/**
 * @author huangtao
 * @date 2020/8/30
 */
public class Q46Solution {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		backtrace(ans, nums, new ArrayList<>());

		return ans;
	}

	private void backtrace(List<List<Integer>> ans, int[] nums, List<Integer> list) {
		if (list.size() == nums.length) {
			ans.add(new ArrayList<>(list));
			return;
		}

		for (int num : nums) {
			if (!list.contains(num)) {
				list.add(num);
				backtrace(ans, nums, list);
				list.remove(list.size()-1);
			}
		}
	}
}
