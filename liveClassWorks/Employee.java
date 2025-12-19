package liveClassWorks;
public class Employee{

    String name;
    int employeeID;
    double salary;


    public Employee(String name,int employeeID,double salary)
    {
        this.name=name;
        this.employeeID=employeeID;
        this.salary=salary;
    }
    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

}