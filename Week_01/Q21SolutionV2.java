/**
 * @author huangtao
 * @date 2020/8/16
 */
public class Q21SolutionV2 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode prev = new ListNode();
		ListNode tmp = prev;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				tmp.next = l1;
				tmp = tmp.next;
				l1 = l1.next;
			} else {
				tmp.next = l2;
				tmp = tmp.next;
				l2 = l2.next;
			}
		}
		tmp.next = (l1 == null) ? l2 : l1;
		return prev.next;
	}
}
