import java.util.Scanner;
class ReverseNumber {
    public static void main(String args[]) {
        int n, reverse = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer to reverse: ");
        n = in.nextInt();
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Reverse of the number is " + reverse);
        in.close();
    }
}