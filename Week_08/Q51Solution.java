package Week_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author huangtao
 * @date 2020/10/11
 */
public class Q51Solution {
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> ans = new ArrayList<>();
		int[] queues = new int[n];
		solve(ans, queues, n, 0, 0, 0, 0);
		return ans;
	}

	private void solve(List<List<String>> ans, int[] queues, int n, int row, int col,
	                   int pie, int na) {
		if (row == n) {
			List<String> board = generateBoard(queues, n);
			ans.add(board);
			return;
		}

		int pos = ((1<<n)-1) & (~(col|pie|na));
		while (pos != 0) {
			int p = pos & (-pos);
			pos = pos & (pos-1);
			queues[row] = Integer.bitCount(p - 1);
			solve(ans, queues, n, row+1, col|p, (pie|p)<<1, (na|p)>>1);
			queues[row] = -1;
		}
	}

	private List<String> generateBoard(int[] queues, int n) {
		List<String> board = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			char[] row = new char[n];
			Arrays.fill(row, '.');
			row[queues[i]] = 'Q';
			board.add(new String(row));
		}
		return board;
	}
}
