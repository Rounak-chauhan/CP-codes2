 private int comb(int n, int k, int[][] memo) {
        if (k == 0) return 1;
        if (n == 0) return 0;
        if (memo[n][k] != 0)
            return memo[n][k];
        memo[n][k] = (comb(n - 1, k, memo) + comb(n - 1, k - 1, memo)) % MOD;
        return memo[n][k];
    }

///isme memo array me store bhi ho rha hai nck
