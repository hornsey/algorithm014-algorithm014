package Week_02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huangtao
 * @date 2020/8/17
 */
public class Q1Solution {
	public int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		if (n < 2) {
			return new int[2];
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(nums[i])) {
				return new int[]{map.get(nums[i]), i};
			} else {
				map.put(target - nums[i], i);
			}
		}
		return new int[2];
		}
}
