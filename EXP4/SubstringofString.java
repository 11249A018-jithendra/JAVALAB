import java.util.Scanner;
class SubstringsOfAString {
    public static void main(String args[]) {
        String string, sub;
        int n = 0;
        int length;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to print all its substrings:");
        string = in.nextLine();
        length = string.length();
        System.out.println("Substrings of \"" + string + "\" are:");
        for (int c = 0; c < length; c++) {
            for (int i = 1; i <= length - c; i++) {
                sub = string.substring(c, c + i);
                System.out.println(sub);
                n++;
            }
        }
        System.out.println("No of substrings present are: " + n);
        in.close();
    }
}