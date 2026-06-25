public class kad {
    public static int maxSubArraySum(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int[] arr1 = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(arr1));
        int[] arr2 = {-5, -2, -3, -4};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(arr2));
}
}
