class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            if(map.get(i)==null)
            {
                map.put(i,map.getOrDefault(i-1,0)+map.getOrDefault(i+1,0)+1);
                map.put(i-map.getOrDefault(i-1,0),map.get(i));
                map.put(i+map.getOrDefault(i+1,0),map.get(i));
                result = Math.max(result,map.get(i));
            }

        }
        return result;
    }
}
