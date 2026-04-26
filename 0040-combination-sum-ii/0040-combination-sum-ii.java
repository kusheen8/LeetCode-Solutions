class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }
    private void dfs(int[] candidates,int target,int idx,List<List<Integer>> ans, List<Integer> sumAns){
        if(target < 0) return;
        else if (target == 0) { ans.add(new ArrayList<>(sumAns));
        }else{
            for(int i = idx;i<candidates.length;i++){
                if(i>idx && candidates[i] == candidates[i -1]) continue;
                sumAns.add(candidates[i]);
                dfs(candidates,target-candidates[i],i+1 , ans, sumAns);
                sumAns.remove(sumAns.size() -1);
            }
        }
    }
}