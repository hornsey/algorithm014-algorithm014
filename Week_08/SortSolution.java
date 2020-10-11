package Week_08;

import java.util.Arrays;

/**
 * @author huangtao
 * @date 2020/10/11
 */
public class SortSolution {

	private void quickSort(int[] nums, int left, int right) {
		if (left >= right) {
			return;
		}

		int pivot = nums[right];
		int tmp = 0, index = left;
		for (int i = left; i < right; i++) {
			if (nums[i] < pivot) {
				tmp = nums[i];
				nums[i] = nums[index];
				nums[index] = tmp;
				index++;
			}
		}

		nums[right] = nums[index];
		nums[index] = pivot;
		quickSort(nums, left, index-1);
		quickSort(nums, index+1, right);
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1,5,2,8,3,7};
		System.out.println(Arrays.toString(nums));
		new SortSolution().quickSort(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(nums));
	}
}
