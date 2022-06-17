/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
		int n = matrix.length;
		int[][] arr1 = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++){
				arr1[j][n-i-1] = matrix[i][j];
			}
		}
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				matrix[i][j] = arr1[i][j];
			}
		}
    }
}
// @lc code=end

