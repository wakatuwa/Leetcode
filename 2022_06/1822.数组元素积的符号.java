/*
 * @lc app=leetcode.cn id=1822 lang=java
 *
 * [1822] 数组元素积的符号
 */

// @lc code=start
class Solution {
    public int arraySign(int[] nums) {
		int count = 0;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == 0) 
				return 0;	
			if(nums[i] < 0) {
				count++;
			}			
		}
		return count%2 == 0 ? 1 : -1;
		
    }
}
// @lc code=end

