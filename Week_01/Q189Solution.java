/**
 * @author huangtao
 * @date 2020/8/16
 */
public class Q189Solution {
	public void rotate(int[] nums, int k) {
		int n = nums.length;
		for (int i = 0; i < k; i++) {
			int prev = nums[n-1];
			System.arraycopy(nums, 0, nums, 1, n - 1);
			nums[0] = prev;
		}
	}
}
