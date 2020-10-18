package Week_09;

/**
 * @author huangtao
 * @date 2020/10/18
 */
public class Q680Solution {
	public boolean validPalindrome(String s) {
		int len = s.length();
		int i = 0, j = len-1;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return helper(s,i+1, j) || helper(s, i, j-1);
			}
		}
		return true;
	}

	private boolean helper(String s, int start, int end) {
		int i = start, j = end;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
