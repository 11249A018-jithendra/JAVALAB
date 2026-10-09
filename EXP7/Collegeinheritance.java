class College {
    String collegeName, principalName;

    College(String collegeName, String principalName) {
        this.collegeName = collegeName;
        this.principalName = principalName;
    }

    void displayCollegeDetails() {
        System.out.println("CollegeName: " + collegeName);
        System.out.println("PrincipalName: " + principalName);
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
        System.out.println("DepartmentName: " + departmentName);
        System.out.println("HODName: " + HODName);
    }
}

class SingleInherit {
    public static void main(String[] args) {
        Department obj = new Department(
            "NIT", "B.K.Sinha", "Electronics", "B.C.Rai"
        );

        obj.displayCollegeDetails();
        obj.displayDepartmentDetails();
    }
}
