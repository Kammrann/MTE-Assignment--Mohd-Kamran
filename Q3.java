public class three {
    public static boolean canSplit(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int prefixSum = 0;
        for (int i = 0; i < arr.length - 1; i++) { // we can't split at the last index
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                System.out.println("Array can be split after index " + i);
                return true;
            }
        }

        System.out.println("Array cannot be split into equal prefix and suffix sums.");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        canSplit(arr);
    }
}
