import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
class Frequency
{
    int[] count;

    Frequency(int[] count)
    {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj)
    {
        Frequency other = (Frequency) obj;

        return Arrays.equals(this.count, other.count);
    }

    @Override
    public int hashCode()
    {
        return Arrays.hashCode(count);
    }
}

class Solution_49
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<Frequency, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++)
        {

            int[] temp = new int[26];

            for(int j = 0; j < strs[i].length(); j++)
            {
                temp[strs[i].charAt(j) - 'a']++;
            }

            Frequency key = new Frequency(temp);

            if(map.containsKey(key))
            {
                map.get(key).add(strs[i]);
            }

            else
            {
                List<String> addList = new ArrayList<>();

                addList.add(strs[i]);

                map.put(key, addList);
            }
        }

        return new ArrayList<>(map.values());
    }
}
