import java.util.HashMap;

class Solution_76 
{
    public String minWindow(String s, String t) 
    {
        if (t.length() > s.length())
            return "";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++)
        {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;

        int count = 0;
        int minSize = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length())
        {
            char ch = s.charAt(right);

            if (map.containsKey(ch))
            {
                window.put(ch, window.getOrDefault(ch, 0) + 1);

                if (window.get(ch) <= map.get(ch))
                {
                    count++;
                }
            }

            while (count == t.length())
            {
                if (right - left + 1 < minSize)
                {
                    minSize = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar))
                {
                    window.put(leftChar, window.get(leftChar) - 1);

                    if (window.get(leftChar) < map.get(leftChar))
                    {
                        count--;
                    }
                }

                left++;
            }

            right++;
        }

        if (minSize == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + minSize);
    }
}
