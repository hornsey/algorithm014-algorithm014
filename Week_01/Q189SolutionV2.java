/**
 * @author huangtao
 * @date 2020/8/16
 * @version 2
 */
public class Q189SolutionV2 {
	public void rotate(int[] nums, int k) {
		int n = nums.length;
		if (n < k) {
			k %= n;
		}
		int[] temp = new int[k];

		System.arraycopy(nums, n-k, temp, 0, k);
		System.arraycopy(nums, 0, nums, k, n - k);
		System.arraycopy(temp, 0, nums, 0, k);

	}
}
