//Aim:
To write a Java program to sort the given array elements in ascending order using nested for loops and swapping.

//Algorithm:
Start the program.
Create an interface Exam with the method percent_cal().
Create a class Student to store the student's name, roll number, and marks in two subjects.
Define a constructor to initialize the student details.
Create a display() method to print the student details.
Create a class Result that extends Student and implements the Exam interface.
Define the percent_cal() method to calculate and display the percentage of marks.
In the main() method, create an object of the Result class.
Display the student details and percentage.
Stop the program.

    //program:
import java.util.Scanner;
public class AscendingOrder {
    public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        // Sorting in ascending order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1) {
                System.out.print(",");
            }
        }
        s.close();
    }
}

//Result:
Thus, the Java program to display student details and calculate the percentage of marks using an interface was executed successfully.
