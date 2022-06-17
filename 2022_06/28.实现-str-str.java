/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
		//定义两个变量，大小为字符串的长度
		int m = haystack.length();
		int n = needle.length();
		//遍历字符串haystack，遍历到m-n的位置就可以,如果到了(m-n)之后，剩下的长度小于n，一定不
		//匹配needle。并且，若是n>m不会进行循环，直接返回-1
		for(int i = 0; i<=m-n; i++){
			//定义标志位flag
			boolean flag = true;
			//遍历字符串needle，遍历到小于n的位置，将needle和对应的haystack相匹配
			//如果有一个字符不相等，就跳出循环，进行外层循环
			for(int j = 0; j<n; j++){
				if(haystack.charAt(i+j)!=needle.charAt(j)){
					flag = false;
					break;
				}
			}
			if(flag) {
				return i;
			}
			//如果flag等于1，说明haystack中有满足题意的子字符串，返回子字符串的首位
		}
		return -1;
    }
}
// @lc code=end

