class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates,target, 0 ,ans,new ArrayList<>());
        return ans;
    }
    private void dfs(int[] candidates,int target, int idx, List<List<Integer>> ans, List<Integer> sumAns){
        if(target < 0) return;
        else if (target == 0){ans.add(new ArrayList<>(sumAns));
        }else{
            for(int i = idx;i <candidates.length;i++){
            sumAns.add(candidates[i]);
            dfs(candidates,target- candidates[i],i,ans,sumAns);
            sumAns.remove(sumAns.size()-1);
            }
        }
    }
}