class Solution {
    public int[] twoSum(int[] nums, int target) {
       int i ,j,n=nums.length;
       for(i=0;i<n;i++){
        for(j=n-1;j>i;j--){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
       }
       return new int[]{0,0};
    }
}