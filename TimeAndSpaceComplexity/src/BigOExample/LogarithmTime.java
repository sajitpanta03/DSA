package BigOExample;

import java.util.Arrays;

public class LogarithmTime {
    public static int binarySearch(String[] studentPens, String targetPen) {
        Arrays.sort(studentPens);

        int left = 0;
        int right = studentPens.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int comparison = studentPens[mid].compareTo(targetPen);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] studentPens = { "Pen 1", "Pen 2", "Pen 3", "Pen 4", "Pen 5", "Pen 6", "Pen 7" };

        String targetPen = "Pen 9";

        int index = binarySearch(studentPens, targetPen);

        if (index != -1) {
            System.out.println("The target pen " + targetPen + " was found at index " + index);
        } else {
            System.out.println("The target pen " + targetPen + " was not found in the array.");
        }
    }
}
