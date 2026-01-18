public class Q1672 {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {

        return Check(accounts);
    }

    static int Check(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int Rowsum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                Rowsum += accounts[i][j];
            }

            if (Rowsum > maxWealth) {
                maxWealth = Rowsum;
            }
        }
        return maxWealth;
    }
}
