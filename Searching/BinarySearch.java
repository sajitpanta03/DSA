public class BinarySearch {
    private static int binarySearch(int numArray[], int number_to_search_for) {
        int low = 0;
        int high = numArray.length - 1;

        while (low <= high) {
            // Calculate mid using bitwise right shift
            int mid = (low + high) >>> 1;
            int midValue = numArray[mid];

            if (number_to_search_for == midValue) {
                return mid;
            } else if (number_to_search_for < midValue) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    // Driver code
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}
