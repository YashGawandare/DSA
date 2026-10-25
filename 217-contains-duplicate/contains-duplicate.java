class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i,n=nums.length;
        Arrays.sort(nums);
        for(i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}