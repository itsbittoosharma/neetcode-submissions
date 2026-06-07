class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int result=0;
        int start=0,end=0;
        map<char,int> map;
        while(end<s.length())
        {
            if(map[s[end]]==0)
            {
                map[s[end]]++;
                result = max(result,end-start+1);
                end++;
            }
            else
            {
                while(s[start]!=s[end])
                {
                    map[s[start]]--;
                    start++;
                }
                map[s[start]]--;
                start++;
            }
        }
        return result;
    }
};
