import java.util.HashMap;
import java.util.List;

class Solution_2913
{
    public int sumCounts(List<Integer> nums) 
    {
        int subArrayLength=1;
        int sum=0;

        while(subArrayLength <= nums.size())
            {
                int i=0;
                int j=i+subArrayLength;

                while(j<=nums.size())
                    {
                        HashMap<Integer,Integer> map=new HashMap<>();
                        for(int k=i;k<j;k++)
                            {
                                map.put(nums.get(k), map.getOrDefault(nums.get(k), 0)+1);
                            }
                        sum=sum+(map.size()*map.size());

                        i++;
                        j++;
                    }

                subArrayLength++;
            }

        return sum;
    }
}