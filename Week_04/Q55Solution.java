package Week_04;

/**
 * @author huangtao
 * @date 2020/9/6
 */
public class Q55Solution {
	public boolean canJump(int[] nums) {
		int target = nums.length - 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] + i >= target) {
				target = i;
			}
		}
		return  target == 0;
	}
}
