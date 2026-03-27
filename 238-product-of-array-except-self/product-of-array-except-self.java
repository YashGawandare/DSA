class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i ,j ,n=nums.length;
        int[] left = new int[n];
        int[] right=new int[n];
        left[0]=1;
        right[n-1]=1;
        for(i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        for(i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(i=0;i<n;i++){
            nums[i]=right[i]*left[i];
        }
        return nums;
    }
}