import java.util.HashSet;

class Solution_128 
{
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> set=new HashSet<>();

        for(int elem:nums)
            {
                set.add(elem);
            }
        
        int count=Integer.MIN_VALUE;
        int compare=0;

        for(int elem:nums)
            {
                compare=0;

                int temp=elem;
                while(set.contains(temp))
                    {
                        set.remove(temp);
                        temp--;
                        compare++;
                    }

                while(set.contains(elem+1))
                    {
                        set.remove(elem+1);
                        elem++;
                        compare++;
                    }

                count=Math.max(compare, count);
            }

        return count;
        
    }
}
