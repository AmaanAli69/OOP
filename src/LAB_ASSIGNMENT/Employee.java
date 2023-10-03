package LAB_ASSIGNMENT;

public class Employee {
    private String employeeID;
    private String name;
    private static String designation = "Lab Attendant";

    public Employee() {
        this.employeeID = "Default";
        this.name = "Default";
    }

    public Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Lab Attendant details :- \n" +
                " Employee ID = '" + employeeID + '\'' +
                "\n Name = '" + name + '\'' + "\n" ;
    }
}


