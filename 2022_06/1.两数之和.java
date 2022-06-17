/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
		//1.暴力破解
		// int n = nums.length;
		// for(int i = 0; i<n; i++) {
		// 	for(int j = i+1; j<n; j++) {
		// 		if(nums[i] + nums[j]== target) {
		// 			return new int[]{i, j};
		// 		}
		// 	}
		// }
		// return new int[0];
		//new一个哈希表,put(key, value),key是值,value是数组下标
		HashMap<Integer, Integer> n2t = new HashMap<Integer, Integer>();
		//定义一个长度为2的数字数组,
		int res[] = new int[2];
		//循环,遍历数组nums,查看哈希映射中的key是否有与target-nums[i]相等的值
		for(int i = 0; i<nums.length; i++) {
			if(n2t.containsKey(target-nums[i]))	{
			//如果有，则把i的值放进res[0]，把target-nums[i]对应的数组下标值放进res[1],res就是结果坐标值
			res[0] = i;
			res[1] = n2t.get(target-nums[i]);
		}
			//如果不匹配，就把新的值，和值对应的数组下标，放进哈希表
			n2t.put(nums[i], i);
		}
		return res;
    }
}
// @lc code=end

