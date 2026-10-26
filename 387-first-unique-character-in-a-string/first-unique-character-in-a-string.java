class Solution {
    public int firstUniqChar(String s) {
        int i,j;
        char[] ch=s.toCharArray();
        int n= ch.length;
        for(i=0;i<n;i++){
            boolean flag=true;
            for(j=0;j<n;j++){
                if(i!=j && ch[i]==ch[j]){
                    flag=false;
                    break;
                }
            
            }
            if(i>=1 && ch[i]==ch[i-1]) continue;
            if(flag) return i;
        }
        return -1;
    }
}