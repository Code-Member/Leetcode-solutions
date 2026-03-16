class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a = s1.split(" ");
        String[] b = s2.split(" ");

        String[] temp = new String[a.length + b.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(a[j])) count++;
            }

            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) count++;
            }

            if (count == 1) {
                temp[k++] = a[i];
            }
        }

        for (int i = 0; i < b.length; i++) {
            int count = 0;

            for (int j = 0; j < b.length; j++) {
                if (b[i].equals(b[j])) count++;
            }

            for (int j = 0; j < a.length; j++) {
                if (b[i].equals(a[j])) count++;
            }

            if (count == 1) {
                temp[k++] = b[i];
            }
        }

        String[] result = new String[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}