//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
// O(N) time and O(1) space complexity
class Solution {
    public int maxProfit(int[] prices) {
       int minsofar=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minsofar)
                minsofar=prices[i];
            profit=Math.max(profit,prices[i]-minsofar);
            
        }
        return profit;
    }
}
