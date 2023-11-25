// This is the code of Time Complexity
public class FindArrayNum {
    static boolean findPair(int[] a, int n, int z) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && a[i] + a[j] == z) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, -3, 5, 9 };
        int z = 3;
        int n = a.length;

        if (findPair(a, n, z)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int count = 0;
        for (int i = n; i > 0; i /= 2)
            for (int j = 0; j < i; j++)
                count++;
                System.out.println(count);
    }
}
