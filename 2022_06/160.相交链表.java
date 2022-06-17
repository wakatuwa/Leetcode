/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		//新建一个哈希集合，利用哈希集合存储链表节点
		Set<ListNode> visited = new HashSet<ListNode>();
		//首先遍历链表A,并将链表A的每个节点加入到哈希集合中
		ListNode temp = headA;
		while (temp != null) {
			visited.add(temp);
			temp = temp.next;
		}
		//遍历链表B,对于遍历到的每个节点，判断是否在哈希集合中
		//找到的第一个就是两个链表的相交节点，遍历B没有，则两链表不存在相交点
		temp = headB;
		while (temp != null) {
			if(visited.contains(temp)){
				return temp;
			}
			temp = temp.next;
		}

		return null;

    }
}
// @lc code=end

