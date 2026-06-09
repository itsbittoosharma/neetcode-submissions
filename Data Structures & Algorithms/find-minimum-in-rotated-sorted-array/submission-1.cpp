class Solution {
public:
    int findMin(vector<int> &nums) {
        int res;
        int start =0, end = nums.size()-1;
        while(start<=end)
        {
            int mid = start + (end-start) / 2 ;

            if(nums[start]<nums[end])
            {
                res = min(res,nums[start]);
                return res;
            }

            res = min(res,nums[mid]);

            if(nums[start]>nums[mid])
            {
                end = mid-1;
            }
            else 
            {
                start = mid+1;
            }


        }

    return res;
    }
};
