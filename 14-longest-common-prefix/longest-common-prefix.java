class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        char[] first=strs[0].toCharArray();
        char[] last=strs[n-1].toCharArray();
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            else{
                str.append(first[i]);
            }
        }
        return str.toString();
    }
}