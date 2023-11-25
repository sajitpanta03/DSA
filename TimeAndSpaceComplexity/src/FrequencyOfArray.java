import java.util.*;

public class FrequencyOfArray {
    static void countFreq(int arr[], int n) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }   

        // Print the frequencies
        for (Map.Entry<Integer, Integer> x : freq.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 10, 20, 5, 20};
        int n = arr.length;
        countFreq(arr, n);
    }
}
