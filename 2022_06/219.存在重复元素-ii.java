/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
		//暴力破解 超时
		// for(int i = 0; i<nums.length; i++) {
		// 	for(int j = i+1; j<nums.length; j++) {
		// 		if(nums[i] == nums[j] && Math.abs(i-j) <= k) {
		// 			return true;
		// 		}
		// 	}
		// }
		// return false;

		//想到哈希表
		//key值是数值，value值是相应的数组下标
		//遍历数组，查看哈希表中是否存在相同的value,以及索引差值小于k
		//如果有，返回true，如果没有将新的key和value放入哈希表，(之前有的key会更新value)
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int length = nums.length;
		for(int i = 0; i<length; i++) {
			int num = nums[i];
			if(map.containsKey(num) && i-map.get(num)<=k ){
				return true;
			}
			map.put(num, i);
		}
		return false;
    }
}
// @lc code=end

