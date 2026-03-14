class Solution {
    public int maxProduct(int[] nums) {
        int i,n=nums.length;
        int max= Integer.MIN_VALUE;
         int j;
         int prod=1;
         if(n==1) return nums[0];
         for(i=0;i<n;i++){
            prod=1;
            for(j=i;j<n;j++){
                prod=prod*nums[j];
                max=Math.max(max,prod);
            }
         }
         return max;
    }
}