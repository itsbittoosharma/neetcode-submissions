class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int result=0;
        int highest = prices[prices.size()-1];
        for(int i=prices.size()-2;i>=0;i--)
        {
            if(prices[i]>highest)
            {
                highest = prices[i];
            }
            else
            {
                result = max(result,highest-prices[i]);
            }
        }
        return result;
    }
};
