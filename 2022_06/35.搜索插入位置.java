/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
		//时间复杂度为(logn)一眼二分法
		//定义左右边界
		int left = 0; 
		int right = nums.length;
		//在左边界大于右边界之前做循环
		while(left < right) {
			//定义mid为中值
			int mid = left + (right - left)/2;
			//如果中值小于target，则将left右移一位，
			//那要是nums[mid]>=target，说明目标值在左区间，就把右边界挪到中值上，
			if(nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
    }
}
// @lc code=end

