package liveClassWorks;

public class Manager extends Employee{
    int teamSize;



    public Manager(String name,int employeeID,double salary,int teamSize)
    {
        super(name,employeeID,salary);
        this.teamSize=teamSize;

    }
    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
        System.out.println("TeamSize: "+ teamSize);
    }
}
