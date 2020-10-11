package Week_08;

/**
 * @author huangtao
 * @date 2020/10/11
 */
public class Q190Solution {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		int ans = 0, bits = 31;
		while (n != 0 && bits >= 0) {
			ans += (n&1) << bits;
			n >>= 1;
			bits--;
		}
		return ans;
	}
}
