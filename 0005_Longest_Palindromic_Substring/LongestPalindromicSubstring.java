import java.util.ArrayList;
import java.util.List;

class Solution_5
{
    public String longestPalindrome(String s)
    {
        int length = 0;
        int compare = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++)
        {

            List<Integer> anslList = expand(s, i, i);
            compare = anslList.get(0);

            if (length < compare)
            {
                length = compare;
                left = anslList.get(1);
                right = anslList.get(2);
            }

            List<Integer> anslList2 = expand(s, i, i + 1);
            compare = anslList2.get(0);

            if (length < compare)
            {
                length = compare;
                left = anslList2.get(1);
                right = anslList2.get(2);
            }
        }

        return s.substring(left + 1, right);
    }

    private List<Integer> expand(String s, int left, int right)
    {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }

        List<Integer> ans = new ArrayList<>();
        ans.add(right - left - 1);
        ans.add(left);
        ans.add(right);

        return ans;
    }
}
