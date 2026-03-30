class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i;
       int k=0;
       for(i=m;i<n+m;i++){
        nums1[i]=nums2[k];
        k++;
       }
       Arrays.sort(nums1);
    }
}