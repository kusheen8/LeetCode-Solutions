class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
       int left = 0;
       int res = 0;
       Set<Character> charset = new HashSet<>();
       for(int right =0;right <n;right++){
        while(charset.contains(s.charAt(right))){
            charset.remove(s.charAt(left));
            left++;
        }
        charset.add(s.charAt(right));
        res=Math.max(res,right-left+1);
       } 
       return res;
    }
}