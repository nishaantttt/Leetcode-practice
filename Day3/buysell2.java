package Day3;

public class buysell2 {

    public int buysell2(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        buysell2 obj = new buysell2();

        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = obj.buysell2(prices);

        System.out.println("Max Profit: " + result);
    }
}