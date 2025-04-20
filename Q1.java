public class one{
    public static int[] buildPrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static int rangeSum(int[] prefixSum, int L, int R) {
        if (L == 0) {
            return prefixSum[R];
        } else {
            return prefixSum[R] - prefixSum[L - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 3, 6, 1, 9};

        int[] prefixSum = buildPrefixSum(arr);

        int L = 2;
        int R = 5;

        int sum = rangeSum(prefixSum, L, R);
        System.out.println("Sum of elements from index " + L + " to " + R + ": " + sum);
    }
}

