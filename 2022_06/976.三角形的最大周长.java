/*
 * @lc app=leetcode.cn id=976 lang=java
 *
 * [976] 三角形的最大周长
 */

// @lc code=start
class Solution {
    public int largestPerimeter(int[] nums) {
		Arrays.sort(nums);
		for(int i = nums.length-1; i>=2; i--) {
			if(nums[i-2] + nums[i-1] > nums[i]) {
				return nums[i-2] + nums[i-1] + nums[i];
			}
		}
		return 0;
    }
}
// @lc code=end

