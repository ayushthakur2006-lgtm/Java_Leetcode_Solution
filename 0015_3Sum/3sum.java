import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution_15
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> ansList = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            map.clear();

            int fixed = nums[i];
            int required = -fixed;

            for (int j = 0; j < nums.length; j++)
            {
                if (i == j)
                {
                    continue;
                }

                int searching = required - nums[j];

                if (map.containsKey(searching))
                {
                    List<Integer> temp = new ArrayList<>();

                    temp.add(fixed);
                    temp.add(searching);
                    temp.add(nums[j]);

                    Collections.sort(temp);

                    if (set.add(temp))
                    {
                        ansList.add(temp);
                    }

                    map.remove(searching);
                }
                else
                {
                    map.put(nums[j], searching);
                }
            }
        }

        return ansList;
    }
}
