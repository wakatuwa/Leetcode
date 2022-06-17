/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
		Set<Integer> seen = new HashSet<>();
		while(n!=1 && !seen.contains(n)) {
			seen.add(n);
			n = getNext(n);
		}
		return n == 1;
	}
	private int getNext(int n){
		int sum = 0;
		while(n>0) {
			sum += (n%10)*(n%10);
			n = n/10;
		}
		return sum;
    }
}
// @lc code=end

