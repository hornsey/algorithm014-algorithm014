package Week_09;

import java.util.Arrays;

/**
 * @author huangtao
 * @date 2020/10/18
 */
public class Q300Solution {
	public int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int len = nums.length;
		int[] dp = new int[len];
		int ans = 1;

		Arrays.fill(dp, 1);

		for (int i = 1; i < len; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			ans = Math.max(ans, dp[i]);
		}
		return ans;
	}
}
