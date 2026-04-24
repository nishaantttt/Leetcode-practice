package Day3;

public class buysell1 {

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        buysell1 obj = new buysell1();

        int[] prices = {7, 1, 5, 3, 6, 4}; // test case
        int result = obj.maxProfit(prices);

        System.out.println("Max Profit: " + result);
    }
}