package Util;

/**
 * @author huangtao
 * @date 2020/7/28
 */
public class ListNode {
	public int val;
	public ListNode next;
	public ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
