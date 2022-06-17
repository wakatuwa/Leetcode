/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根 
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
		//暴力，超时
		// int result = 1;
		// for(int i = 1; i * i <= x; i++) {
		// 	if(i*i >= x) {
		// 		result = i;
		// 		break;
		// 	} else {
		// 		result = i+1;
		// 	}
			
		// }
		// return result*result == x ? result : result -1;

		//二分法
		int left = 0;
		int right = x;
		int ans = -1;
		while(left<=right) {
			int mid =left + (right - left) / 2;	//防止溢出
			if((long)mid*mid<=x) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid -1;
			}
		}
		return ans;
    }
}
// @lc code=end

