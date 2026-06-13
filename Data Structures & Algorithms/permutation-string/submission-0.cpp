class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        if(s2.length()<s1.length()) return false;

        unordered_map<char,int> map1;

        for(char i:s1)
        {
            map1[i]++;
        }

        unordered_map<char,int> map2;

        for(int i=0;i<s1.length();i++)
        {
            map2[s2[i]]++;
        }

        if(map1==map2) return true;

        for(int i=0, j=s1.length();j<s2.length();i++,j++)
        {
            map2[s2[i]]--;
            
        if(map2[s2[i]] == 0) {
            map2.erase(s2[i]);   
            }

            map2[s2[j]]++;

            if(map1==map2) return true;
        }

        return false;
    }
};
