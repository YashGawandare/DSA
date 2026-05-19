class Solution {
    public int subarraySum(int[] nums, int k) {
        int i,j,n=nums.length;
        int count=0;
        for(i=0;i<n;i++){
            int sum=0;
            for(j=i;j<n;j++){
                sum=sum+nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}