class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        dfs(s,0,ans,new ArrayList<>());
        return ans;
    }
    private void dfs(String s,int idx,List<List<String>> ans,List<String> sumAns){
        if(idx == s.length()){
            ans.add(new ArrayList<>(sumAns));
        }else{
            for(int i = idx+1;i<=s.length();i++){
               if(ispalindrome(s,idx,i-1)){
                sumAns.add(s.substring(idx,i));
                dfs(s,i,ans,sumAns);
                sumAns.remove(sumAns.size()-1);
               }
            }
        }
    }
    public boolean ispalindrome(String s, int low,int high){
        while(low < high)
            if(s.charAt(low++) != s.charAt(high--)) return false;
        return true;
    }
}