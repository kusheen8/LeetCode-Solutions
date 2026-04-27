class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums,ans,new ArrayList<>());
        return ans;
    }
    public void dfs(int[] nums,List<List<Integer>> ans, List<Integer> sumAns){
        if(sumAns.size()== nums.length){
            ans.add(new ArrayList<>(sumAns));
        }else{
            for(int i = 0;i<nums.length;i++){
                if(sumAns.contains(nums[i])) continue;
                sumAns.add(nums[i]);
                dfs(nums,ans,sumAns);
                sumAns.remove(sumAns.size()-1);
            }
        }
    }
}