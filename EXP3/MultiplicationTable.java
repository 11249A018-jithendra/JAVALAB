import java.util.Scanner;
public class MulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int no = sc.nextInt();
        System.out.println("Multiplication Table of " + no);
        for (int i = 0; i < 10; i++) {
            System.out.println(no + " * " + (i + 1) + " = " + (no * (i + 1)));
        }
        sc.close();
    }
}