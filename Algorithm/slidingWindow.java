public class slidingWindow {
    public static int maxSubarraySum(int[] arr, int num) {
        if (num > arr.length) {
            return -1;
        }

        int maxSum = 0;
        int tempSum = 0;

        for (int i = 0; i < num; i++) {
            maxSum += arr[i];
        }

        tempSum = maxSum;

        for (int i = num; i < arr.length; i++) {
            tempSum = tempSum - arr[i - num] + arr[i];
            maxSum = Math.max(maxSum, tempSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 3;
        int maxSum = maxSubarraySum(arr, num);

        System.out.println(maxSum);
    }
}
