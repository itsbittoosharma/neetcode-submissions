class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_map<int,int> map;
        int result =0;
        for(int num:nums)
        {
            if(!map.count(num))
            {
                int left = map.count(num - 1) ? map[num - 1] : 0;
                int right = map.count(num + 1) ? map[num + 1] : 0;
                int length = left + right + 1;
                map[num] = length;
                map[num - left] = length;
                map[num + right] = length;
                result = max(result,length);
            }
        }
        return result;
    }
};
