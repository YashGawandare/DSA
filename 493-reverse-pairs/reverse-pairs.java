class Solution {
    static int count=0;
    public static void conquer(int[] arr,int si,int mid,int ei){
        int[] merged=new int[ei-si+1];
        int indx1=si;
        int indx2=mid+1;
        int x= 0;
        while(indx1<=mid && indx2<=ei){
            if(arr[indx1]<=arr[indx2]){
                merged[x++]=arr[indx1++];
            }
            else{
                merged[x++]=arr[indx2++];
                
            }
        }
        while(indx1<=mid)  merged[x++]=arr[indx1++];
        while(indx2<=ei)  merged[x++]=arr[indx2++];
        for(int i=0,j=si;i<merged.length;j++,i++){
            arr[j]=merged[i];
        }
    }
        public static void countPairs(int[] arr,int si,int mid,int ei){
            int j=mid+1;
            for(int i=si;i<=mid;i++){
                while(j<=ei && arr[i]>2L*arr[j]){
                    j++;
                }
                count+=(j-(mid+1));
            }
        }
    public static void divide(int[] arr, int si, int ei){
        if(si>=ei) return;
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        countPairs(arr,si,mid,ei);
        conquer(arr,si,mid,ei);
    }
    public int reversePairs(int[] nums) {
        count=0;
        divide(nums,0,nums.length-1);
        return count;
    }
}