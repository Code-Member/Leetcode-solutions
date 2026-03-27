class Solution {
    public int[] findEvenNumbers(int[] digits) {
         Set<Integer> result = new HashSet<>();
        int n = digits.length;

        // Try all permutations of 3 different indices
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue; // no leading zero

            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    if (digits[k] % 2 != 0) continue; // last digit must be even

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    result.add(num);
                }
            }
        }

        // Convert set to sorted array
        List<Integer> list = new ArrayList<>(result);
        Collections.sort(list);

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}