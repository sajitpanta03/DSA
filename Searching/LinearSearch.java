// Linear Search is defined as a sequential search algorithm that start at one end and goes through each element
// of a list until desired element is found, otherwise the search continues till the end of the data set.

class LinearSearch {
    public static int search(int arr[], int j, int x) {
        for (int i = 0; i < j; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 9;

        int result = search(arr, arr.length, x);
            if (result == -1) {
                System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}
