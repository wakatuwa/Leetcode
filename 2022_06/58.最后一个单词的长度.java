/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
		s = s.trim();
		return s.length() - s.lastIndexOf(" ") -1;
    }
}
// @lc code=end

