class Solution {
    static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        return (int)((modPow(5, even) * modPow(4, odd)) % MOD);
    }

    private long modPow(long base, long exp) {
        long res = 1;
        base %= MOD;

        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }

        return res;
    }
}