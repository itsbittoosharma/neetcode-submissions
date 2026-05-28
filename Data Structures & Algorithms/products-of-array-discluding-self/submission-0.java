class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int prod2=1;
        int zero = 0;
        for(int i:nums)
        {
            if(i!=0 && zero<2)
            {
                prod2 = prod2*i;
                
            }
            else
            {
                zero++;
                if(zero>1) prod2=0;
            }
            prod = prod*i;
            System.out.println(prod2);
        }
        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(zero>1)
            {
                result[i] = 0;
            }
            else if(zero>0)
            {
                if(nums[i]==0)
                {
                    result[i]=prod2;
                }
                else
                {
                    result[i]=0;
                }
            }
            else
            {
                result[i]=prod/nums[i];
            }


            // if(nums[i]!=0 && prod!=0)
            // {
            // result[i] = prod/nums[i];
            // }
            // else
            // {
            //     if(prod!=0)
            //     result[i] = prod2/nums[i];
            // }
        }
        return result;
    }
}  
