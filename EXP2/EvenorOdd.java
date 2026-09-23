import java.util.*;
class EvenOddSwitch {
    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        switch (n % 2) {
            case 0:
                System.out.println("This number is even");
                break;
            case 1:
            case -1:
                System.out.println("This number is odd");
                break;
        }
        s.close();
    }
}