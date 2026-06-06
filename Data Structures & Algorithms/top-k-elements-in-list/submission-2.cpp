class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> count;
        for(int num:nums)
        {
            count[num]++;
        }
        vector<vector<int>> freq(nums.size()+1);
        for(auto i:count)
        {
            freq[i.second].push_back(i.first);
        }

        vector<int> results;

        for(int i=freq.size()-1;i>0;i--)
        {
            for(auto j:freq[i])
            {
                results.push_back(j);
                if(results.size()==k)
                {
                    return results;
                }
            }
        }
        return {};
    }
};
