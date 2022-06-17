/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		char[] c = s.toCharArray();
		for(int i = 0; i<c.length; i++){
			if(c[i]=='('||c[i]=='{'||c[i]=='['){
				stack.push(c[i]);
			} else {
				if(stack.isEmpty()){
					return false;
				}
			
			else {
				if(stack.peek()=='('&&c[i]==')'||stack.peek()=='{'&&c[i]=='}'||stack.peek()=='['&&c[i]==']'){
					stack.pop();
				} else {
					return false;
				}
			}
			}
			
				
		}
		return stack.isEmpty();
    }
}
// @lc code=end

