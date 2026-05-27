class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int ind=0;ind<strs.length;ind++)
        {
            int[] tempArr = new int[26];
            for(char ch:strs[ind].toCharArray())
            {
                tempArr[ch-'a']++;
            }
            String key = Arrays.toString(tempArr);
            map.putIfAbsent(key,new ArrayList<String>());
            map.get(key).add(strs[ind]);
        }
        for(List<String> val:map.values())
        {
            result.add(val);
        }
        return result;
    }
}
