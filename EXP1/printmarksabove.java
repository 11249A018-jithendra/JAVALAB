//Aim:
To write a Java program to read the names and marks of six students and display the names and marks of students who scored 60 or above.
    
//Algorithm:
Start the program.
Import the Scanner class to get input from the user.
Declare two arrays: name[] to store student names and marks[] to store marks.
Read the names and marks of six students using a for loop.
Traverse the marks array using another for loop.
Check whether each student's marks are greater than or equal to 60.
If the condition is true, display the student's name and marks.
Close the scanner.
Stop the program.

    
//program:
import java.util.Scanner;
public class printmarksabove {
    public static void main(String args[]) {
        int marks[] = new int[6];
        String name[] = new String[6];
        Scanner scanner = new Scanner(System.in);
        // Input student names and marks
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }
        // Display students who scored 60 or above
        System.out.println("\nStudents who scored 60 or above:");
        for (int i = 0; i < 6; i++) {
            if (marks[i] >= 60) {
                System.out.println(name[i] + " " + marks[i]);
            }
        }
        scanner.close();
    }
}
//output:
Enter Name of Student and Marks of Subject 1: Arun 85
Enter Name of Student and Marks of Subject 2: Priya 56
Enter Name of Student and Marks of Subject 3: Ravi 72
Enter Name of Student and Marks of Subject 4: Divya 45
Enter Name of Student and Marks of Subject 5: Kiran 60
Enter Name of Student and Marks of Subject 6: Meena 91

Students who scored 60 or above:
Arun 85
Ravi 72
Kiran 60
Meena 91

//Result:
Thus, the Java program to display the names and marks of students who scored 60 or above was executed successfully.
