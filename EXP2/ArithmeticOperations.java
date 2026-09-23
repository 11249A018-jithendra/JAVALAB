import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Enter the two numbers to perform operations");
            System.out.print("Enter the first number: ");
            int x = s.nextInt();
            System.out.print("Enter the second number: ");
            int y = s.nextInt();
            System.out.println("\nChoose the operation you want to perform");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for MODULUS");
            System.out.println("Choose 6 for EXIT");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    int add = x + y;
                    System.out.println("Result: " + add);
                    break;
                case 2:
                    int sub = x - y;
                    System.out.println("Result: " + sub);
                    break;
                case 3:
                    int mul = x * y;
                    System.out.println("Result: " + mul);
                    break;
                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                case 5:
                    if (y != 0) {
                        int mod = x % y;
                        System.out.println("Result: " + mod);
                    } else {
                        System.out.println("Cannot find modulus with zero.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    s.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1 to 6.");
            }
        }
    }
}