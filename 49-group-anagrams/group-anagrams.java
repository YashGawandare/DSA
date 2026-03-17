class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int i ,j,n=strs.length;
        Map<String ,List<String>> map=new HashMap<>();
        for(i=0;i<n;i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String key= new String(temp);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        List<List<String>> list = new ArrayList<>(map.values());
        return list;
    }
}