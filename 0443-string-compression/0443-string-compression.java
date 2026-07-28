class Solution {
    public int compress(char[] chars) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i<chars.length){
            int j = i;
            while(j<chars.length && chars[i]==chars[j]){
                j++;
            }
            sb.append(chars[i]);
            int len = j-i;
            if(len >1){
                sb.append(len);
            }
            i=j;
        }
            for(i=0;i<sb.length();i++){
                chars[i] = sb.charAt(i);
            }
        return sb.length();
    }
}