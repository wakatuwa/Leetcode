/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
		//暴力 超时
		// int len = nums.length;
		// int max = Integer.MIN_VALUE;
		// for(int i= 0;i<len; i++) {
		// 	int sum = 0;
		// 	for(int j = i; j<len; j++) {
		// 		sum += nums[j];
		// 		if(sum > max) {
		// 			max = sum;
		// 		}
		// 	}
		// }
		// return max;

		//动态规划,
		//pre就是一个不断维护的动态子数组的和,如果往后遍历时，pre如果小于0，
		//则将之前的和抛弃,取新加入的num作为新的动态子数组的起点,
		//无论num大小，总要将它加入这个动态子数组
		//同时，用res记录最大值，最后将它输出
		int pre = 0;
		int res = nums[0];
		for(int num: nums){
			pre=Math.max(pre+num, num);
			res=Math.max(pre, res);
		}
		return res;
    }
}
// @lc code=end

