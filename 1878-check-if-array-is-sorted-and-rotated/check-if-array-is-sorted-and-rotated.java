class Solution {
    public boolean check(int[] arr) {
       int i,n=arr.length;
       int count=0;
       for(i=0;i<n;i++){
        if(arr[i]>arr[(i+1)%n]){
            count++;
        }
       }
       if(count>1){
        return false;
       }
       return true;
    }
}