class Solution {
    public int maxProfit(int[] prices) {
        int i,j,n=prices.length;
        int max=0;
        int minprice=prices[0];
        i=1;
        while(i<n){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else{
                int profit=prices[i]-minprice;
                max=Math.max(profit,max);
            }
            i++;
        }
        return max;
    }
}