/*
 * @lc app=leetcode.cn id=1790 lang=java
 *
 * [1790] 仅执行一次字符串交换能否使两个字符串相等
 */

// @lc code=start
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
		int count = 0;
		int[] index = new int[2];
		for(int i = 0, j = 0; i<s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)){
			count++;
			if(count==3) {
				return false;
			}
			index[j++] = i;
			}
		}
		return s1.charAt(index[0]) ==s2.charAt(index[1]) && s1.charAt(index[1])== s2.charAt(index[0]);
    }
}
// @lc code=end

