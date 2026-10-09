Aim
To write a Java program to demonstrate single inheritance by creating a College class and a derived Department class to display college and department details.

Algorithm
Start the program.
Create a class College with variables collegeName and principalName.
Define a constructor to initialize the college name and principal name.
Define the displayCollegeDetails() method to display the college details.
Create a class Department that extends the College class.
Declare variables departmentName and HODName in the Department class.
Define a constructor and use super() to initialize the parent class variables.
Define the displayDepartmentDetails() method to display the department name and HOD name.
In the main() method, create an object of the Department class.
Call both display methods to print the college and department details.
Stop the program.

//program:

import java.io.*;
class College {
    String collegeName, principalName;
    College(String collegeName, String principalName) {
        this.collegeName = collegeName;
        this.principalName = principalName;
    }
    void displayCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Principal Name: " + principalName);
    }
}
class Department extends College {
    String departmentName, HODName;
    Department(String collegeName, String principalName,
               String departmentName, String HODName) {
        super(collegeName, principalName);
        this.departmentName = departmentName;
        this.HODName = HODName;
    }
    void displayDepartmentDetails() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("HOD Name: " + HODName);
    }
}
public class SingleInherit {
    public static void main(String[] args) {
        Department obj = new Department(
            "NIT", "B.K. Sinha", "Electronics", "B.C. Rai"
        );
        obj.displayCollegeDetails();
        obj.displayDepartmentDetails();
    }
}


//Result:
Thus, the Java program to demonstrate single inheritance and display college and department details was executed successfully.