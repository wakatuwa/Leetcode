/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
		int ret = 0;
		while(n!=0) {
			//观察二进制的 n & n-1 ,运算结果恰为n的最低位1变为0
			//利用这个性质，当n不等于0的时候，不停翻转，每翻转一次就令计数的ret加1
			n &= n-1;
			ret++;
		}
		return ret;
    }
}
// @lc code=end

