import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
        fibonacci(n);
        s.close();
    }
    public static void fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        }
        else if (n == 1) {
            System.out.println("0");
        }
        else {
            int a = 0;
            int b = 1;
            System.out.print("Fibonacci Series: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int nextNumber = a + b;
                a = b;
                b = nextNumber;
            }
        }
    }
}