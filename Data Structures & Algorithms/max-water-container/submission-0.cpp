class Solution {
public:
    int maxArea(vector<int>& heights) {
        int result=0;
        int start=0,end=heights.size()-1;
        while(start<end)
        {
            int width = end-start;
            int fill = width*min(heights[start],heights[end]);
            result = max(result,fill);
            if(heights[start]<=heights[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return result;
    }
};
