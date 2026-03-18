class Solution {
    public int removeElement(int[] nums, int val) {
        int i,j;
        int n=nums.length;
        i=0;
        j=n-1;
        int k=0;
        while(i<=j){
           if(nums[i]==val){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            k++;
            j--;
           }
           else{
           i++;}
        
        }
        return i;
    }
}