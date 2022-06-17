/*
 * @lc app=leetcode.cn id=1502 lang=java
 *
 * [1502] 判断能否形成等差数列
 */

// @lc code=start
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
		Arrays.sort(arr);
		if(arr.length == 2) {
			return true;
		}
		for(int i = 0; i<arr.length-2; i++) {
			if(arr[i+1] - arr[i] != arr[i+2] -arr[i+1] ){
				return false;
			}
		}
		return true;
    }
}
// @lc code=end

