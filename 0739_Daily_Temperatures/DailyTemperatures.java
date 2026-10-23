import java.util.ArrayList;
import java.util.List;

class Solution_739 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int[] ans = new int[temperatures.length];

        if (temperatures.length == 0)
            {
                return ans;
            }

        List<Integer> list = new ArrayList<>();
        list.add(temperatures.length - 1);

        int i = temperatures.length - 2;

        while (i >= 0)
            {
                while (!list.isEmpty() &&
                       temperatures[list.get(list.size() - 1)] <= temperatures[i])
                    {
                        list.remove(list.size() - 1);
                    }

                if (!list.isEmpty())
                    {
                        ans[i] = list.get(list.size() - 1) - i;
                    }
                else
                    {
                        ans[i] = 0;
                    }

                list.add(i);
                i--;
            }

        return ans;
    }
}
