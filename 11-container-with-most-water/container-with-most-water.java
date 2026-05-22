class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int area=0;
        int water=0;
        int i=0;
        int j=n-1;
            while(i<j){
                area=(j-i)*Math.min(height[i],height[j]);
                water=Math.max(area,water);
                if(height[i]<height[j]) 
                {
                    i++;
                }
                else{
                    j--;
                }
        }

        return water;
    }
}