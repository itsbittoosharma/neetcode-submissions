class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i:nums)
        // {
        //     if(map.get(i)==null)
        //     {
        //         map.put(i,map.getOrDefault(i-1,0)+map.getOrDefault(i+1,0)+1);
        //         map.put(i-map.getOrDefault(i-1,0),map.get(i));
        //         map.put(i+map.getOrDefault(i+1,0),map.get(i));
        //         result = Math.max(result,map.get(i));
        //     }

        // }

        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums)
        {
            hs.add(i);
        }
        for(int i:hs)
        {
            if(!hs.contains(i-1))
            {
                int count = 1;
                int num = i;
                while(hs.contains(num+1))
                {
                    count++;
                    num++;
                }
                result = Math.max(count,result);
            }
        }
        return result;
    }
}
