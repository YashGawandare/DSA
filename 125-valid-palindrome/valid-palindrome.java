class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("\\s","");
        s=s.replaceAll("[^a-zA-Z0-9]","");
        char[] ch1=s.toCharArray();
        char[] ch =s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;j--;
        }
        for(i=0;i<ch.length;i++){
            if(ch[i]!=ch1[i]){
                return false;
            }
        }
        return true;
    }
}