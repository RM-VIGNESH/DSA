package academy.learnprogramming;

public class SELLING_STOCKS {

    static int maxProfit(int prices[], int n)
    {
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < n; i++) {

            // Checking for lower buy value
            if (buy > prices[i])
                buy = prices[i];

                // Checking for higher profit
            else if (prices[i] - buy > max_profit)
                max_profit = prices[i] - buy;
        }
        return max_profit;
    }

    // Driver Code
    public static void main(String args[])
    {
        int prices[] = { 8, 1, 5, 2, 10 };
        int n = prices.length;
        int max_profit = maxProfit(prices, n);
        System.out.println(max_profit);
    }
}

