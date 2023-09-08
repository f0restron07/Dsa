public class maxwealth {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int maxWealth = maximumWealth(matrix);
        System.out.println("Maximum Wealth: " + maxWealth);
    }

    public static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int maxWealth = Integer.MIN_VALUE;
        for (int[] personAccounts : accounts) {
            int sum = 0;
            for (int accountBalance : personAccounts) {
                sum += accountBalance;
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
