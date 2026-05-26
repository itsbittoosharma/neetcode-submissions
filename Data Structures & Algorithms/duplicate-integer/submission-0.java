class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> a = new HashSet();
        for(int i: nums)
        {
            if(a.contains(i))
            return true;
            else
            a.add(i);
        } 
        return false;
    }
}