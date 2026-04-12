class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if ((long)m * k > bloomDay.length) {
            return -1;
        }

        int low = min(bloomDay);
        int high = max(bloomDay);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (flowers(bloomDay, k, m, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean flowers(int[] bloomDay, int k, int m, int day) {
        int consecutive = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                consecutive++;
            } else {
                consecutive = 0;
            }

            if (consecutive == k) {
                bouquets++;
                consecutive = 0;
            }

            if (bouquets == m) {
                return true;
            }
        }

        return false;
    }

    private int min(int[] bloomDay) {
        int mini = bloomDay[0];
        for (int x : bloomDay) {
            mini = Math.min(mini, x);
        }
        return mini;
    }

    private int max(int[] bloomDay) {
        int maxi = bloomDay[0];
        for (int x : bloomDay) {
            maxi = Math.max(maxi, x);
        }
        return maxi;
    }
}