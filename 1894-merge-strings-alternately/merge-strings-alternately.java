class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        StringBuilder str = new StringBuilder();
        int j=0,i=0;
    while(i<n1 && j<n2){
        str.append(word1.charAt(i));
        str.append(word2.charAt(j));
        i++;
        j++;

    }
    while(i<n1){
        str.append(word1.charAt(i));
        i++;
    }
    while(j<n2){
        str.append(word2.charAt(j));
        j++;
    }
    return str.toString();
        }
}