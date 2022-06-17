/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
		// //如何进位,思路混乱失败
		// int jin = 1;
		// int len = digits.length;
		// int [] arr = new int[len+1];
		// for(int i = len-1; i>=0; i--){
		// 	if(digits[i]==9&&jin==1){
		// 		arr[i+1] = 0;
		// 		jin = 1;
		// 	} else {
		// 		arr[i+1] = digits[i];
		// 		jin = 0;
		// 	}
		// }
		
		// if(jin == 0) {
		// 	arr[len] = digits[len-1]+1;
		// 	int [] res = new int[len];
		// 	for(int i = 0; i<len; i++) {
		// 		res[i] = arr[i+1];
		// 	}
		// 	return res;		
		// }
		// arr[0] = 1;
		// return arr;

		//找出最长后缀9
		//题目可以看做数组后面有几个数字9，从后往前遍历，遇到第一个不是9的数字加1
		//这个数字后面数的全部置0
		int len = digits.length;
		for(int i = len-1; i>=0; i--) {
			if(digits[i]!=9) {
				digits[i]++;
				for(int j = i+1; j<len; j++) {
					digits[j] = 0;
				}
				return digits;
			}
		}
		//如果全部的位都为0，那么新建一个数组，比digits多一位，并将第一位置1，其他位置0
		int [] arr = new int[len+1];
		arr[0] = 1;
		return arr;
    }
}
// @lc code=end

