import java.util.ArrayList;
import java.util.List;

class Solution_1249
{
    public String minRemoveToMakeValid(String s)
    {
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                list.add(i);
            }
            else if(s.charAt(i) == ')')
            {
                if(list.isEmpty())
                {
                    sb.setCharAt(i, '*');
                }
                else
                {
                    list.remove(list.size() - 1);
                }
            }
        }

        for(int i : list)
        {
            sb.setCharAt(i, '*');
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < sb.length(); i++)
        {
            if(sb.charAt(i) != '*')
            {
                ans.append(sb.charAt(i));
            }
        }

        return ans.toString();
    }
}