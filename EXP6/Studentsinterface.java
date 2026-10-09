Aim
To write a Java program to display student details and calculate the percentage of marks using an interface and inheritance.

Algorithm
Start the program.
Create an interface Exam with the method percent_cal().
Create a class Student to store the student's name, roll number, and marks in two subjects.
Define a constructor to initialize the student details.
Define a display() method to display the student details.
Create a class Result that extends Student and implements the Exam interface.
Define the percent_cal() method to calculate the total marks and percentage.
Override the display() method to call the parent class's display() method using super.display().
In the main() method, create an object of the Result class with the student's details.
Display the student details and percentage.
Stop the program.

//program:
interface Exam {
    void percent_cal();
}
class Student {
    String name;
    int roll_no, mark1, mark2;
    Student(String n, int r, int m1, int m2) {
        name = n;
        roll_no = r;
        mark1 = m1;
        mark2 = m2;
    }
    void display() {
        System.out.println("Name of Student: " + name);
        System.out.println("Roll No. of Student: " + roll_no);
        System.out.println("Marks of Subject 1: " + mark1);
        System.out.println("Marks of Subject 2: " + mark2);
    }
}
class Result extends Student implements Exam {
    Result(String n, int r, int m1, int m2) {
        super(n, r, m1, m2);
    }
    public void percent_cal() {
        int total = mark1 + mark2;
        float percent = total * 100.0f / 200;
        System.out.println("Percentage: " + percent + "%");
    }
    void display() {
        super.display();
    }
}
public class StuDetail {
    public static void main(String[] args) {
        Result R = new Result("Ragini", 12, 93, 84);
        R.display();
        R.percent_cal();
    }
}

//Result:
Thus, the Java program to display student details and calculate the percentage of marks using an interface and inheritance was executed successfully.