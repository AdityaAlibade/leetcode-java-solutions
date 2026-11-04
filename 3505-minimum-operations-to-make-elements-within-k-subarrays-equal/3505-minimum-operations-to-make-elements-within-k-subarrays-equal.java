class Solution {

    class Fenwick {
        int n;
        long[] count, sum;

        Fenwick(int n) {
            this.n = n;
            count = new long[n + 1];
            sum = new long[n + 1];
        }

        void add(int i, long c, long s) {
            for (; i <= n; i += i & -i) {
                count[i] += c;
                sum[i] += s;
            }
        }

        long queryCount(int i) {
            long ans = 0;
            for (; i > 0; i -= i & -i)
                ans += count[i];
            return ans;
        }

        long querySum(int i) {
            long ans = 0;
            for (; i > 0; i -= i & -i)
                ans += sum[i];
            return ans;
        }

        int kth(long k) {
            int idx = 0;

            for (int bit = Integer.highestOneBit(n);
                 bit > 0; bit >>= 1) {

                int next = idx + bit;

                if (next <= n && count[next] < k) {
                    idx = next;
                    k -= count[next];
                }
            }

            return idx + 1;
        }
    }

    public long minOperations(int[] nums, int x, int k) {

        int n = nums.length;

        if ((long) x * k > n)
            return -1;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int m = 0;

        for (int v : sorted) {
            if (m == 0 || sorted[m - 1] != v) {
                sorted[m++] = v;
            }
        }

        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            rank[i] = Arrays.binarySearch(
                sorted, 0, m, nums[i]
            ) + 1;
        }

        Fenwick bit = new Fenwick(m);

        long totalSum = 0;

        for (int i = 0; i < x; i++) {
            bit.add(rank[i], 1, nums[i]);
            totalSum += nums[i];
        }

        long[] cost = new long[n - x + 1];

        for (int i = 0; i <= n - x; i++) {

            // Median
            int mid = bit.kth((x + 1) / 2);
            long median = sorted[mid - 1];

            long leftCount = bit.queryCount(mid);
            long leftSum = bit.querySum(mid);

            long rightCount = x - leftCount;
            long rightSum = totalSum - leftSum;

            cost[i] =
                median * leftCount - leftSum
                + rightSum - median * rightCount;

            if (i < n - x) {

                bit.add(rank[i], -1, -nums[i]);
                totalSum -= nums[i];

                bit.add(rank[i + x], 1, nums[i + x]);
                totalSum += nums[i + x];
            }
        }

        long INF = Long.MAX_VALUE / 4;

        long[] prev = new long[n + 1];
        long[] curr = new long[n + 1];

        for (int j = 1; j <= k; j++) {

            curr[0] = INF;

            for (int i = 1; i <= n; i++) {

                curr[i] = curr[i - 1];

                if (i >= x && prev[i - x] != INF) {

                    curr[i] = Math.min(
                        curr[i],
                        prev[i - x] + cost[i - x]
                    );
                }
            }

            long[] temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[n];
    }
}