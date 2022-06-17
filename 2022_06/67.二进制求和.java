/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
		// //api大法,先将字符串转化为十进制，相加，再将结果转化为二进制字符串
		// //但字符串超过33位，就无法转化成Integer型，导致失败
		// return Integer.toBinaryString(
		// 	Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
		// );

		//模拟
		//定义结果字符串
		StringBuilder res = new StringBuilder();
		//定义a，b遍历的位置，和进位标志carry
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		while(i>=0 || j>=0 || carry!=0) {//	a，b不遍历完，或者carry不等于0就继续遍历
			int digitA = i >= 0 ? a.charAt(i) - '0' : 0;	//当前a的取值
			int digitB = j >= 0 ? b.charAt(j) - '0' : 0;	//当前b的取值
			int sum = digitA + digitB + carry;	//当前位置相加的结果
			carry = sum >= 2 ? 1 : 0;	//是否有进位
			sum = sum >= 2 ? sum -2 : sum;	//去除进位后的sum
			res.append(sum); 	//将结果拼到res中去
			i--;	//遍历到a的位置向左移动
			j--;	//遍历到b的位置向左移动
		}
		return res.reverse().toString();	//将结果反转并返回
    }
}
// @lc code=end

