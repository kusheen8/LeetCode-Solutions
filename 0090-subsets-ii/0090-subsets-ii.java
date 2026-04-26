class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,0,ans,new ArrayList<>());
        return ans;
    }
    private void dfs(int[] nums,int idx,List<List<Integer>> ans,List<Integer> sumAns){
        ans.add(new ArrayList<>(sumAns));
        for(int i =idx;i<nums.length;i++){
            if(i> idx && nums[i] == nums[i-1]) continue;
            sumAns.add(nums[i]);
            dfs(nums,i+1,ans,sumAns);
            sumAns.remove(sumAns.size()-1);
        }
    }
}