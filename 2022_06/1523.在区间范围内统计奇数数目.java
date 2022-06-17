/*
 * @lc app=leetcode.cn id=1523 lang=java
 *
 * [1523] 在区间范围内统计奇数数目
 */

// @lc code=start
class Solution {
    public int countOdds(int low, int high) {
		//区间所有数字个数分奇偶讨论
		//若相差为奇数，则区间数字个数为偶数，区间奇偶数个数相等
		if((high-low)%2!=0) { 
			return (high-low+1)/2;
		}
		//相差为偶数，区间数字个数为奇数，low为奇数则奇数比偶数多1，否则相反
		else {
			if(low %2==0) return (high-low)/2;
			else {
				return (high-low)/2+1;
			}
		}
    }
}
// @lc code=end

