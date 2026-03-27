class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str.append(ch);
            }
        }
        String st=str.toString().toLowerCase();
        char[] first=st.toCharArray();
        char[] last=st.toCharArray();
        int i=0;
        int j=last.length-1;
        while(i<j){
            char temp=last[i];
            last[i]=last[j];
            last[j]=temp;
            i++;j--;
        }
        boolean flag=true;
        for(i=0;i<last.length;i++){
            if(last[i]!=first[i]){
                flag=false;
            }
        }
        if(flag){
            return true;
        }
        else{
            return false;
        }
    }
}