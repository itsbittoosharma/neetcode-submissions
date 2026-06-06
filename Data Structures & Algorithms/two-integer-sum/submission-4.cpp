class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> map;
        for(int i=0;i<nums.size();i++)
        {
            int num = nums[i];
            if(map.count(target-num))
            {
                return vector<int> {map[target-num],i};
            }
            else
            {
                map[num]=i;
            }
        }
        return {};
    }
};
