public class eight {
    private static String swap(String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }

    // Recursive function to generate permutations
    private static void generatePermutations(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
            return;
        }

        for (int i = left; i <= right; i++) {
            // Swap current index with the left
            str = swap(str, left, i);
            // Recurse
            generatePermutations(str, left + 1, right);
            // Backtrack
            str = swap(str, left, i);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("All permutations of the string \"" + input + "\":");
        generatePermutations(input, 0, input.length() - 1);
    }
    
}
