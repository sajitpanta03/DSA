class BubbleSort {
    public static void bubbleSort(int a[]) {
        int n = a.length;
        int swapping;

        for (int i = 0; i < n - 1; i++) {
            swapping = 0;

            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    swapping = 1;
                }
            }
            if (swapping == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 10, 12, 5, 11, 22 };
        bubbleSort(a);
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
