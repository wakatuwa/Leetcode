/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		if(ransomNote.length()>magazine.length()) {
			return false;
		}
		//建立一个26个小写字母一一对应的数组
		int[] ch = new int[26];
		//遍历magazine，对应的字符就加一
		for(char i: magazine.toCharArray()) {
			ch[i - 'a']++;
		}
		//遍历ransomNote，对应的字符就减一
		for(char i: ransomNote.toCharArray()) {
			ch[i - 'a']--;
			if(ch[i-'a']<0) {
				return false;
			}
		}
		return true;

    }
}
// @lc code=end

