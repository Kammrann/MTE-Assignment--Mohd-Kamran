public class seven {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        // Start by assuming the prefix is the first string
        String prefix = strs[0];

        // Compare the prefix with each string
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                // Trim the prefix from the end
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + result);
    }
}
