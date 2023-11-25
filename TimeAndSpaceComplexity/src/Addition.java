import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter the two number");

            int a = myObj.nextInt();
            int b = myObj.nextInt();

            int c =  a + b;

            System.out.println("The answer is: " + c);
        }
    }
}
