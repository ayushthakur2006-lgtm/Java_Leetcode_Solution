import java.util.Arrays;
import java.util.HashMap;

class Solution_853
{
    public int carFleet(int target, int[] position, int[] speed)
    {
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < position.length; i++)
        {
            map.put(position[i], speed[i]);
        }

        Arrays.sort(position);

        double[] time = new double[position.length];

        for(int j = 0; j < position.length; j++)
        {
            int temp = position[j];

            time[j] = (double)(target - temp) / map.get(temp);
        }

        int k = position.length - 1;

        while(k >= 0)
        {
            double currTime = time[k];
            count++;

            while(k > 0 && time[k - 1] <= currTime)
            {
                k--;
            }

            k--;
        }

        return count;
    }
}
