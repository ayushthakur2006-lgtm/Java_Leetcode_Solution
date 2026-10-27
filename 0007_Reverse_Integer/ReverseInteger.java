class Solution_7 
{
    public int reverse(int x) 
    {
        if (x == Integer.MIN_VALUE)
        {
            return 0;
        }

        boolean negative = false;

        if (x < 0)
        {
            x = -x;
            negative = true;
        }

        StringBuilder sb = new StringBuilder(String.valueOf(x));
        sb.reverse();

        while (sb.length() > 1 && sb.charAt(0) == '0')
        {
            sb.deleteCharAt(0);
        }

        int answer = 0;

        while (x != 0)
        {
            int digit = x % 10;
            x /= 10;

            answer = answer * 10 + digit;
        }

        StringBuilder ans = new StringBuilder(String.valueOf(answer));

        if (ans.toString().equals(sb.toString()))
        {
            if (negative)
            {
                return -answer;
            }

            return answer;
        }

        return 0;
    }
}
