class Solution_8 
{
    public int myAtoi(String s) 
    {
        StringBuilder answer = new StringBuilder(s);

        while (answer.length() > 0 && answer.charAt(0) == ' ')
        {
            answer.deleteCharAt(0);
        }

        if (answer.length() == 0)
        {
            return 0;
        }

        boolean negative = false;

        if (answer.charAt(0) == '-')
        {
            negative = true;
            answer.deleteCharAt(0);
        }
        else if (answer.charAt(0) == '+')
        {
            answer.deleteCharAt(0);
        }

        while (answer.length() > 0 && answer.charAt(0) == '0')
        {
            answer.deleteCharAt(0);
        }

        for (int i = 0; i < answer.length(); i++)
        {
            if (!Character.isDigit(answer.charAt(i)))
            {
                answer.delete(i, answer.length());
                break;
            }
        }

        if (answer.length() == 0)
        {
            return 0;
        }

        try
        {
            long num = Long.parseLong(answer.toString());

            if (negative)
            {
                num = -num;
            }

            if (num > Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }

            if (num < Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }

            return (int) num;
        }
        catch (NumberFormatException e)
        {
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
