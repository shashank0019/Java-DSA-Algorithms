public class stock
{
    int getMaxProfit(int prices[])
    {
        int minValue = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] < minValue)
            {
                minValue = prices[i];
            }

            int profit = prices[i] - minValue;

            if(profit > maxProfit)
            {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) 
    {
        int prices[] = {2, 1, 1, 3, 4, 4};

        stock obj = new stock();

        System.out.println(obj.getMaxProfit(prices));
    }
}