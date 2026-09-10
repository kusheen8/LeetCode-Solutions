class Solution {
    public int compress(char[] chars) {
        int count = 1;
        int new_count = 0;
        int n = chars.length;
        for(int i = 1;i<n;i++){
            if(chars[i]== chars[i-1]){
                count++;
            }else{
                chars[new_count++] = chars[i-1];
                if(count >1){
                    for(char c : Integer.toString(count).toCharArray()){
                        chars[new_count++] = c;
                    }
                }
                count = 1;
            }
        }
        chars[new_count++] = chars[n-1];
        if(count >1){
                    for(char c : Integer.toString(count).toCharArray()){
                        chars[new_count++] = c;
                    }
                }
        return new_count;
    }
}