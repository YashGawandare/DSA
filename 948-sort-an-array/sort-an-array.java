class Solution {
public void conquer(int[] nums,int si,int mid,int ei){
    int[] merger=new int[ei-si+1];
    int idx1=si;
    int idx2=mid+1;
    int x=0;
    while(idx1<=mid && idx2<=ei){
        if(nums[idx1]<=nums[idx2]){
            merger[x++]=nums[idx1++];
        }
        else{
            merger[x++]=nums[idx2++];
        }
    }
    while(idx1<=mid){ merger[x++]=nums[idx1++];}
    while(idx2<=ei) {merger[x++]=nums[idx2++];}
    for(int i=0;i<merger.length;i++){
        nums[si+i]=merger[i];
    }
}

public void divide(int[] nums,int si,int ei){
    if(si>=ei) return; 
    int mid=si+(ei-si)/2;
    divide(nums,si,mid);
    divide(nums,mid+1,ei);
    conquer(nums,si,mid,ei);
}

    public int[] sortArray(int[] nums) {
        int i,j,n=nums.length;
        divide(nums,0,n-1);
        return nums;
    }
}