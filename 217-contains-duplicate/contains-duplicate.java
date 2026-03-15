class Solution {
    public boolean containsDuplicate(int[] nums) {
       int i,n=nums.length;
       Set<Integer> set = new HashSet<>();
       set.add(nums[0]);
       for(i=1;i<n;i++){
        if(set.contains(nums[i])){
            return true;
        }
        set.add(nums[i]);
       }
       return false;
    }
}



