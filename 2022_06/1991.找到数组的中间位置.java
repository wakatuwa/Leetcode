/*
 * @lc app=leetcode.cn id=1991 lang=java
 *
 * [1991] 找到数组的中间位置
 */

// @lc code=start
class Solution {
    public int findMiddleIndex(int[] nums) {
		int sum = 0;
		int half = 0;
		for(int i = 0; i<nums.length; i++) {
			sum += nums[i];
		}
		
		for(int i = 0; i<nums.length; i++){
			sum -= nums[i];
			if(half==sum){
				return i;
			}
			half += nums[i];
		}
		
		return -1;
    }
}
// @lc code=end

