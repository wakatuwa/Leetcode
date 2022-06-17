/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
		//一眼斐波那契数列
		int fn1 = 0;
		int fn2 = 0;
		int fn3 = 1;
		for(int i = 0; i<n; i++) {
			fn1 = fn2;
			fn2 = fn3;
			fn3 = fn1 + fn2;
		}
		return fn3;
    }
}
// @lc code=end

