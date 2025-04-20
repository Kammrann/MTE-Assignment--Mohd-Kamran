public class four {
    public static int maxSumSubarrayOfSizeK(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            System.out.println("Array size is smaller than k");
            return -1;
        }

        // Compute sum of first window of size k
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = maxSumSubarrayOfSizeK(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}
