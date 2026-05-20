class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0;
        Set<List<Integer>> set=new HashSet<>();
       
        while(i<n-2){
            int j=i+1;
            int k=n-1;
            while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                set.add(list);
                j++; 
                k--;
            }
            else if(sum>0){
                k--;
            }
            else{
                j++;
            }
            }
    i++;
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}