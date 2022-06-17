/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
		//如果字符串数组为空或者长度等于0，直接返回空
		if(strs == null || strs.length == 0) {
			return "";
		}
		//设置length等于第一个字符串的长度，count等于字符串数组的长度
		int length = strs[0].length();
		int count = strs.length;
		//循环，遍历第一个字符串，每取到一个字符设置为c和之后的字符串做比较
		//如果遍历时i的大小已经等于之后的某一个字符或者后面字符串对应位置的字符不等于c
		//就截取第一个字符串(0,i)之间的字符串
		for(int i = 0; i<length; i++) {
			char c = strs[0].charAt(i);
			for(int j = 0; j<count; j++) {
				if(i==strs[j].length()||c!=strs[j].charAt(i))
					return strs[0].substring(0, i);
			}
		}
		//循环结束，说明第一个字符串就是最长公共前缀
		return strs[0];
    }
}
// @lc code=end

