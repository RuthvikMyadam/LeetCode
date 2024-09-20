/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String str = s.trim();
        int len = str.length();

        if(len == 0){
            return 0;
        }
        for(int i = len-1; i>= 0; i--){
            if(str.charAt(i) == ' '){
                return count;
            }
            count++;
        }
     return count;
    }
}
// @lc code=end

