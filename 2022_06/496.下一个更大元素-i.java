/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];
		for(int i = 0; i<nums1.length; i++) {
			ans[i] = -1;
			int index = 0;
			for(int j = 0; j<nums2.length; j++) {
				if(nums1[i] == nums2[j])
				index = j;
			}
			for(int k = index; k<nums2.length; k++) {
				if(nums2[k] > nums1[i]) {
					ans[i] = nums2[k];
					//一旦找到第一个满足的位置，立刻跳出循环
					break;
				}
			}
		}
		return ans;
    }
}
// @lc code=end

