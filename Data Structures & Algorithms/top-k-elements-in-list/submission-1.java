class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i:nums)
        {
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }
        // List<Integer>[] bucket = new ArrayList[nums.length + 1];
        // for(int num: freqMap.keySet())
        // {
        //     int freq = freqMap.get(num);
        //     if(bucket[freq]==null)
        //     {
        //         bucket[freq] = new ArrayList<Integer>();
        //     }
        //     bucket[freq].add(num);
        // }

        int[] result = new int[k];

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->freqMap.get(b)-freqMap.get(a));

        for(int num:freqMap.keySet())
        {
            pq.add(num);
        }

        for(int i=0;i<result.length;i++)
        {
            result[i]=pq.poll();
        }


        // int resInd = 0;
        // for(int ind=bucket.length-1;ind>=0 && resInd<k;ind--)
        // {
        //     if(bucket[ind]!=null)
        //     {
        //         for(int i:bucket[ind])
        //         {
        //             result[resInd++] = i;
        //         }
        //     }
        // }
        return result;
    }
}
