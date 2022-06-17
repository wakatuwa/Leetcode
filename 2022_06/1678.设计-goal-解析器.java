/*
 * @lc app=leetcode.cn id=1678 lang=java
 *
 * [1678] 设计 Goal 解析器
 */

// @lc code=start
class Solution {
    public String interpret(String command) {
		command = command.replace("()", "o");
		command = command.replace("(al)", "al");
		return command;
    }
}
// @lc code=end

