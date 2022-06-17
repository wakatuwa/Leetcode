/*
 * @lc app=leetcode.cn id=1768 lang=java
 *
 * [1768] 交替合并字符串
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<word1.length()||i<word2.length(); i++){
			if(i<word1.length())
				sb.append(word1.charAt(i));
			if(i<word2.length())
				sb.append(word2.charAt(i));
		}
		return sb.toString();
    }
}
// @lc code=end

