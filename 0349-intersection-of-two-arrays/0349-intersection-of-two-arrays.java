class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        HashSet<Integer> set = new HashSet<>();
        for(int value1 :nums2){
            for(int value2 : nums1){
                if(value1 == value2){
                    set.add(value1);
                    break;
                }
            }
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for(int num :set){
            arr[i++] = num;
        }
        return arr;
    }
}