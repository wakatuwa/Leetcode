/*
 * @lc app=leetcode.cn id=1572 lang=java
 *
 * [1572] 矩阵对角线元素的和
 */

// @lc code=start
class Solution {
    public int diagonalSum(int[][] mat) {
		int n = mat.length;
		int sum = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(i==j || j == n-i-1)
				sum += mat[i][j];
			}
		} 
		return sum;
    }
}
// @lc code=end

