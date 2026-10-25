class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
         char[] s2=t.toCharArray();
         Arrays.sort(s1);
         Arrays.sort(s2);
         int i=0,j=0;
         if(s1.length!=s2.length) return false;
         while(i<s1.length && j<s2.length){
            if(s1[i]!=s2[j]){
                return false;
            }
            i++;j++;
         }
         return true;
    }
}