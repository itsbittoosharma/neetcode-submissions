class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> result;
        unordered_map<string,vector<string>> map;
        for(auto str:strs)
        {
            int arr[26]={0};
            for(int i=0;i<str.length();i++)
            {
                arr[str[i]-'a']++;
            }
            string key;
            for(int i=0;i<26;i++)
            {
                key+=to_string(arr[i])+",";
                
            }
            // cout << key;
            map[key].push_back(str);
        }
        for(auto pair:map)
        {
            result.push_back(pair.second);
        }
        return result;
    }
};
