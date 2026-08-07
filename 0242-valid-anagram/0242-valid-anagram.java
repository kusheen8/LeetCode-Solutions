class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        boolean[] used = new boolean[t.length()];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            boolean  found = false;
            for(int j=0;j<t.length();j++){
                if(!used[j] && ch == t.charAt(j)){
                    used[j] = true;
                    found = true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
}