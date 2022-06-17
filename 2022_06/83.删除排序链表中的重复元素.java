/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
		//如果是空链表，直接返回本身
		if (head == null) {
			return head;
		}
		ListNode cur = head;
		//当不是尾结点时循环操作
		while(cur.next != null) {
			//如果当前节点和下一个节点的值相同
			if(cur.val == cur.next.val) {
				//就把指向下一个节点的指针挪到指向下下一个节点
				cur.next = cur.next.next;
			} else {
				//否则，继续往下遍历
				cur = cur.next;
			}
		}
		return head;
    }
}
// @lc code=end

