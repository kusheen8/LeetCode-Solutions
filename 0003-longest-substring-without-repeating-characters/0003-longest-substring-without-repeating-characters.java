import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int res = 0;
        Set<Character> charSet = new HashSet<>();
        for(int right = 0;right <n;right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            res = Math.max(res,right-left+1);
        }
        return res;
    }
}