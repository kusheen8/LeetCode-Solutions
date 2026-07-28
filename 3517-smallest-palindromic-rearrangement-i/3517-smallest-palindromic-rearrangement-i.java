class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for(int i = 0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder left = new StringBuilder();
        String middle ="";

        for(int i =0;i<26;i++){
            int times = freq[i]/2;
            while(times >0){
                left.append((char)(i + 'a'));
                times--;
            }
            if (freq[i]%2 == 1){
                middle = "" + (char)(i+'a');
            }
        }
        String right = left.reverse().toString();
        left.reverse();
        return left.toString() + middle + right;
    }
}