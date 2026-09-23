import java.util.*;
public class Replace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        System.out.println("Enter the variable to be replaced and the variable that replaces it:");
        String a = sc.next();
        String e = sc.next();
        String replaceString = s1.replace(a, e);
        System.out.println("After replacement: " + replaceString);
        sc.close();
    }
}