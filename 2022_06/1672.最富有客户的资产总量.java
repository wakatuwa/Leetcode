/*
 * @lc app=leetcode.cn id=1672 lang=java
 *
 * [1672] 最富有客户的资产总量
 */

// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
		int max = 0;
		for(int i = 0; i<accounts.length; i++) {
			int sum = 0;
			for(int j = 0; j<accounts[0].length; j++) {
				sum += accounts[i][j];
			}
			if(sum > max) 
				max = sum;
		}
		return max;
    }
}
// @lc code=end

