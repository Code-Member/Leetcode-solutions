class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        // Try every possible split for first and second number
        for (int i = 1; i <= n / 2; i++) {
            // Leading zero check
            if (num.charAt(0) == '0' && i > 1) break;

            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {
                // Leading zero check
                if (num.charAt(i) == '0' && j > 1) break;

                if (isValid(num, i, j)) return true;
            }
        }
        return false;
    }

    private boolean isValid(String num, int i, int j) {
        long num1 = Long.parseLong(num.substring(0, i));
        long num2 = Long.parseLong(num.substring(i, i + j));

        int start = i + j;

        while (start < num.length()) {
            long sum = num1 + num2;
            String sumStr = String.valueOf(sum);

            if (!num.startsWith(sumStr, start)) return false;

            start += sumStr.length();
            num1 = num2;
            num2 = sum;
        }

        return true;
    }
}