
class Richest_Customer_Wealth {

    public static void main(String[] args) {

        int customers[][] = {{1, 2, 3,}, {4, 5, 6}, {4, 2, 5}};

        System.out.println(maximumWealth(customers));
    }

    static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int customer[] : accounts) {
            int sum = 0;
            for (int amount : customer) {
                sum += amount;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}
