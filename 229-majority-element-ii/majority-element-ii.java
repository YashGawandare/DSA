class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int len=n/3;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key)>len){
                list.add(key);
            }
        }

          return list;
            }

}