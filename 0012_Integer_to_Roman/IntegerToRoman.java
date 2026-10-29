import java.util.HashMap;

class Solution_12
{
    public String intToRoman(int num)
    {
        HashMap<Integer, String> ROMAN = new HashMap<>();

        ROMAN.put(1, "I");
        ROMAN.put(5, "V");
        ROMAN.put(10, "X");
        ROMAN.put(50, "L");
        ROMAN.put(100, "C");
        ROMAN.put(500, "D");
        ROMAN.put(1000, "M");
        ROMAN.put(4, "IV");
        ROMAN.put(9, "IX");
        ROMAN.put(40, "XL");
        ROMAN.put(90, "XC");
        ROMAN.put(400, "CD");
        ROMAN.put(900, "CM");

        StringBuilder aStringBuilder = new StringBuilder();

        int count = 0;

        while (num > 0)
        {
            int digit = num % 10;
            count++;
            num /= 10;

            int place = (int)Math.pow(10, count - 1);

            if (digit == 0)
            {
                continue;
            }
            else if (ROMAN.containsKey(digit * place))
            {
                aStringBuilder.insert(0, ROMAN.get(digit * place));
            }
            else if (digit == 2)
            {
                aStringBuilder.insert(0, ROMAN.get(place));
                aStringBuilder.insert(0, ROMAN.get(place));
            }
            else if (digit == 3)
            {
                aStringBuilder.insert(0, ROMAN.get(place));
                aStringBuilder.insert(0, ROMAN.get(place));
                aStringBuilder.insert(0, ROMAN.get(place));
            }
            else if (digit == 6)
            {
                aStringBuilder.insert(0, ROMAN.get(place));
                aStringBuilder.insert(0, ROMAN.get(5 * place));
            }
            else if (digit == 7)
            {
                aStringBuilder.insert(0, ROMAN.get(place));
                aStringBuilder.insert(0, ROMAN.get(place));
                aStringBuilder.insert(0, ROMAN.get(5 * place));
            }
            else
            {
                aStringBuilder.insert(0, ROMAN.get(place));
                aStringBuilder.insert(0, ROMAN.get(place));
                aStringBuilder.insert(0, ROMAN.get(place));
                aStringBuilder.insert(0, ROMAN.get(5 * place));
            }
        }

        return aStringBuilder.toString();
    }
}
