/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
		String string = Integer.toString(n);
		char[] arr = string.toCharArray();
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == '1'){
				count++;
			}
		}
		return count;
    }
}
// @lc code=end

