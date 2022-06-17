/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
		int count = 0;
		for(int i = 0,j = 0; i<nums.length; i++) {
			if(nums[i] != 0) {
				nums[j++] = nums[i];
				count++;
			}
		}
		for(int j = count; j<nums.length; j++) {
			nums[j] = 0;
		}
    }
}
// @lc code=end

