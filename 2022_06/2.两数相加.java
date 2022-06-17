/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//新建两个链表，使dummy保存头结点，cur作为指针指向新链表的最后一个节点
		//即往cur后面挂新节点
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		//carry作为进位标志
		int carry = 0;
		//当两个链表有一个不为空时就继续循环
		while(l1 != null || l2 != null) {
			//取数据
			int d1 = l1 == null ? 0 : l1.val;
			int d2 = l2 == null ? 0 : l2.val;
			//求和，分析结果，sum大于10则carry进位
			int sum = d1 + d2 + carry;
			carry = sum >= 10 ? 1 : 0;
			//取余把结果作为新节点放到cur后面
			cur.next = new ListNode(sum%10);
			//cur向后移动
			cur = cur.next;
			//不到尾结点，l1或l2向后移动节点
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		//如果carry最后还是等于1说明最后结果超出了max(l1位数, l2位数),往后再加
		//一个值等于1的节点，回归dummy.next(新链表的头结点)
		if (carry == 1) cur.next = new ListNode(1);
		return dummy.next;
    }
}
// @lc code=end

