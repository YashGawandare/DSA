class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=1,n=nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(num>0) set.add(num);
        }

        while(true){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
    }
}