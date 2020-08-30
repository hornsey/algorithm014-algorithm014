package Week_03;

import java.util.*;

/**
 * @author huangtao
 * @date 2020/8/30
 */
public class Q47Solution {
	public List<List<Integer>> permuteUnique(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for (int num : nums) {
			list.add(num);
		}
		backtrace(set, list, 0, nums.length);
		return new ArrayList<>(set);
	}

	private void backtrace(Set<List<Integer>> set, List<Integer> list, int start, int len) {
		if (start == len) {
			set.add(new ArrayList<>(list));
			return;
		}

		for (int i = start; i < len; i++) {
			if (list.get(i).equals(list.get(start))) {
				backtrace(set, list, start+1, len);
			} else {
				Collections.swap(list, start, i);
				backtrace(set, list, start+1, len);
				Collections.swap(list, start, i);
			}
		}
	}
}
