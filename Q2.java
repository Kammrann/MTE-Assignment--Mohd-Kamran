public class two {
    public static void findEquilibriumIndices(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (leftSum == totalSum - leftSum - arr[i]) {
                System.out.println("Equilibrium index found at: " + i);
                found = true;
            }
            leftSum += arr[i];
        }

        if (!found) {
            System.out.println("No equilibrium index found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        findEquilibriumIndices(arr);
    }
}
