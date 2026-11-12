import java.util.ArrayList;
import java.util.List;

class Solution_68
{
    public List<String> fullJustify(String[] words, int maxWidth)
    {
        int count = 0;
        int number = 0;
        List<String> anslList = new ArrayList<>();

        int i = 0;

        while (i < words.length)
        {
            int start = i;
            count = 0;
            number = 0;

            while (i < words.length &&
                   count + words[i].length() + number <= maxWidth)
            {
                count += words[i].length();
                number++;
                i++;
            }

            StringBuilder sb = new StringBuilder();

            if (i == words.length || number == 1)
            {
                for (int j = start; j < i; j++)
                {
                    sb.append(words[j]);

                    if (j < i - 1)
                    {
                        sb.append(" ");
                    }
                }

                sb.append(" ".repeat(maxWidth - sb.length()));
            }
            else
            {
                int spaces = maxWidth - count;
                int gaps = number - 1;
                int first = spaces / gaps;
                int extra = spaces % gaps;

                for (int j = start; j < i; j++)
                {
                    sb.append(words[j]);

                    if (j < i - 1)
                    {
                        int currentSpaces = first;

                        if (extra > 0)
                        {
                            currentSpaces++;
                            extra--;
                        }

                        sb.append(" ".repeat(currentSpaces));
                    }
                }
            }

            anslList.add(sb.toString());
        }

        return anslList;
    }
}
