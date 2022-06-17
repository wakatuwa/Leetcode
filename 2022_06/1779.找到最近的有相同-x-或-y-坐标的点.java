/*
 * @lc app=leetcode.cn id=1779 lang=java
 *
 * [1779] 找到最近的有相同 X 或 Y 坐标的点
 */

// @lc code=start
class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
		int index = -1;
		int minDistance = Integer.MAX_VALUE;
		for(int i = 0; i<points.length; i++) {
			if(x==points[i][0]&&y==points[i][1]) {
				return 0;
			}
			if(x!=points[i][0]&&y!=points[i][1]) {
				continue;
			}
			if(x==points[i][0]||y==points[i][1]) {
				int distance = Math.abs(points[i][0] -x)+ Math.abs(points[i][1] -y);
				if(distance < minDistance) {
				minDistance = distance;
				index = i;
				}
				if(distance == minDistance) {
					if(index > i) {
						index = i;
					}
				}
			}
		}
		return index;
    }
}
// @lc code=end

