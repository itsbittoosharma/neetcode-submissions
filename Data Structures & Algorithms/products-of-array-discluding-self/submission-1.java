class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int pre = 1;
        res[0] = 1;
        for(int i=1;i<nums.length;i++)
        {
            res[i] = nums[i-1]*res[i-1];
        }

        int post = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            res[i] = res[i]*post;
            post = post*nums[i];
        }
        return res;
    }
}  
