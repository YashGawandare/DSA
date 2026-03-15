class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        int n1=arr1.length;
        int n2=arr2.length;
        if(n1!=n2) return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<n1;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}