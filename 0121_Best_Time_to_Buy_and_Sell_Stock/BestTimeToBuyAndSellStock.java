class Solution_121 
{
    public int maxProfit(int[] prices) 
    {
        int[] temp = new int[2];
        temp[0] = -1;
        temp[1] = -1;
        int maxProfit = 0;

        for (int val : prices)
        {
            if (temp[0] == -1 || val < temp[0])
            {
                if (temp[1] != -1)
                    maxProfit = Math.max(maxProfit, temp[1] - temp[0]);

                temp[0] = val;
                temp[1] = -1;
            }
            else if (temp[1] == -1 || val > temp[1])
            {
                temp[1] = val;
            }
        }

        if (temp[1] != -1)
            maxProfit = Math.max(maxProfit, temp[1] - temp[0]);

        return maxProfit;
    }
}
