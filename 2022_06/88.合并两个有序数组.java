/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		//直接将nums2塞到nums1中，然后排序
		for(int i = 0; i<n; i++) {
			nums1[i+m] = nums2[i];
		}
		Arrays.sort(nums1);
    }
}
// @lc code=end

