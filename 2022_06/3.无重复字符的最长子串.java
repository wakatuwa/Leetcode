/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
		//定义滑动窗口的大小res，左边界left，右边界right
		int res = 0, left = 0, right = 0;
		//new一个字符哈希表，将遍历字符串出现过的字符放入这个表中
		HashSet<Character> t = new HashSet<Character>();
		//循环开始，如果哈希表中不存在right字符，就将其放入，同时更新res
		//如果是哈希表已经存在的字符，就从左边开始删除，直到出现不重复的字符
		while (right < s.length()){
			if(!t.contains(s.charAt(right))){
				t.add(s.charAt(right++));
				res = Math.max(res, t.size());
			} else {
				t.remove(s.charAt(left++));
			}
		}
		return res;
    }
}
// @lc code=end

