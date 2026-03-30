class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String cleaned = s.replace("-", "").toUpperCase();
        
        StringBuilder result = new StringBuilder();
        int firstGroupLength = cleaned.length() % k;
        int index = 0;
        
        // Handle first group (can be smaller)
        if (firstGroupLength > 0) {
            result.append(cleaned.substring(0, firstGroupLength));
            index = firstGroupLength;
        }
        
        // Process remaining groups of size k
        while (index < cleaned.length()) {
            if (result.length() > 0) {
                result.append("-");
            }
            result.append(cleaned.substring(index, index + k));
            index += k;
        }
        
        return result.toString();
    }
}