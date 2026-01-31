class Solution {
    public boolean canJump(int[] nums) {
        int first = 0;
        for(int i = 0;i<nums.length;i++){
            if(i>first){
                return false;
            }
            first=Math.max(first,i+nums[i]);
        }
        return true;
    }
}