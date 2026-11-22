class Solution_122
{
    public int maxProfit(int[] prices)
    {
        int profit = 0;
        int i = 0;

        while(i < prices.length - 1)
        {

            while(i < prices.length - 1 && prices[i] >= prices[i + 1])
            {
                i++;
            }

            int currentStock = prices[i];

            int j = i;

            while(j < prices.length - 1 && prices[j] <= prices[j + 1])
            {
                j++;
            }

            profit += prices[j] - currentStock;

            i = j;
        }

        return profit;
    }
}
